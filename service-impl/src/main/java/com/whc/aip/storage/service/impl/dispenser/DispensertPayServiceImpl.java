package com.whc.aip.storage.service.impl.dispenser;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.wanhuchina.common.util.zk.ZkPropertyUtil;
import com.whc.aip.storage.dao.order.OrderMapper;
import com.whc.aip.storage.dao.warehouse.WarehouseCellMapper;
import com.whc.aip.storage.model.cabinet.Cabinet;
import com.whc.aip.storage.model.member.Member;
import com.whc.aip.storage.model.order.Order;
import com.whc.aip.storage.model.order.OrderFill;
import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.model.warehouse.WarehouseCell;
import com.whc.aip.storage.service.cabinet.CabinetService;
import com.whc.aip.storage.service.dispenser.DispensertPayService;
import com.whc.aip.storage.service.member.MemberService;
import com.whc.aip.storage.service.order.OrderService;
import com.whc.aip.storage.service.util.UtilService;
import com.whc.aip.storage.service.voucher.VoucherService;
import com.whc.aip.storage.service.warehouse.WarehouseCellService;
import com.whc.aip.storage.service.warehouse.WarehouseService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2017/5/27.
 */
@Service("DispensertPayService")
public class DispensertPayServiceImpl implements DispensertPayService {
    public static final org.slf4j.Logger log = LoggerFactory.getLogger(DispensertPayServiceImpl.class);
    @Resource
    private MemberService memberService;
    @Resource
    private WarehouseCellService warehouseCellService;
    @Resource
    private WarehouseService warehouseService;
    @Resource
    private OrderService orderService;
    @Resource
    private CabinetService cabinetService;
    @Resource
    private UtilService utilService;
    @Resource
    private VoucherService voucherService;
    //门店（启用/停用）信息
    String message="";
    String orderId="";
    String imageUrl="";
    @Resource
    private WarehouseCellMapper warehouseCellMapper;
    @Resource
    private OrderMapper orderMapper;
    //版本判断  ver=2为新版UI
    private String ver="";
    @Override
    public Map<String,Object> getDispensertPay(String unit, String number, String openId, String wahoceId, String total, String memberName, String memberTel, String wahoId, String wahoType, String rentalTime) {
        OrderFill orderFillParams = new OrderFill();
        orderFillParams.setUnit(unit);
        orderFillParams.setNumber(number);
        orderFillParams.setOpenId(openId);
        orderFillParams.setWahoceId(wahoceId);
        orderFillParams.setTotal(total);
        orderFillParams.setMemberName(memberName);
        orderFillParams.setMemberTel(memberTel);
        orderFillParams.setWahoId(wahoId);
        orderFillParams.setWahoType(wahoType);
        orderFillParams.setRentalTime(rentalTime);

        if (orderFillParams == null){
            throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
        }
        try {

            //获取memberId
            Member member = memberService.getMemberId(orderFillParams.getOpenId());
            //获取wahoId,仓位状态
            WarehouseCell warehouseCell = warehouseCellService.getWahoId(orderFillParams.getWahoceId());
            //根据wahoId获取门店type,门店status
            Warehouse warehouse = warehouseService.getWarehouseType(warehouseCell.getWahoId());
            //1:停用 2:启用
            if("1".equals(warehouse.getStatus())){
                message= "门店已停用.";
            }else if("0".equals(warehouseCell.getStatus())){
                //状态：0：空闲 1：已使用 2停用，3:可预定，4：预约
                warehouseCell.setStatus("4");
                warehouseCellMapper.updateByPrimaryKeySelective(warehouseCell);
                //新增订单
                Order order = new Order();
                order.setMemberId(member.getId());
                //增加已发生租金
                order.setAmount("0");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Calendar calendar =Calendar.getInstance();
                long time = System.currentTimeMillis();
                calendar.setTimeInMillis(time/1000/60*60*1000);
                order.setStartDate(String.valueOf(dateFormat.format(calendar.getTime())));
                calendar.setTimeInMillis(System.currentTimeMillis()/1000/60*60*1000+Long.valueOf(rentalTime)*3600*1000);
                order.setEndDate(String.valueOf(dateFormat.format(calendar.getTime())));
                order.setExeAccount(total);
                order.setTotalAmount(total);
                order.setWahoceId(wahoceId);
                order.setCustName(memberName);
                order.setCustTel(memberTel);
                order.setIsDisplay("0");//历史订单删除项（是否显示）
                order.setStatus("0");//订单状态：0 待付款(待支付) 1 已生效（已支付） 2 已过期 3 作废 4退单（已支付后退单的）5待审核
                order.setType("0");//订单类型：1续仓，0新增
                SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                String createDate = dateFormat1.format(new Date());
                order.setCreateDate(createDate);
                order.setPayType("3");//订单的支付方式：1现金;2 汇款 3在线支付
                order.setSource("0");//订单来源,0:微信端,1:pc端,2APP
                order.setAmountType("3");//订单租金支付方式：0:月付 1:季付 2:年付 3:一次性付清
                order.setTypeMoeny(total);//订单按租金支付方式的每次应付的金额
                order.setDepositStatus("0");//押金状态：0：未退还，1：已退还
                order.setNextOrder("-1");//续仓的订单的id 初始值:-1 表示此订单没有续仓
                order.setNumber(number);//租用时长
                order.setUnit(unit);//租用单位
                order.setDeposit1("0");//去掉押金
                DecimalFormat df=new DecimalFormat("######0.00");
                String totalAmountStr=df.format(Double.valueOf(total));
                order.setTotalAmount(totalAmountStr);
                orderMapper.insertSelective(order);
                orderId = order.getId();
                imageUrl = "/orderAction!addView.do";
                message= "immediateRental";
            }else{
                message= "柜体被占用."+warehouseCell.getStatus();
            }
            Map<String,Object> data = new HashMap<>();
            data.put("message",message);
            data.put("wahoId",warehouseCell.getWahoId());
            data.put("wahoType",warehouse.getType());
            data.put("orderId",orderId);
            return data;
        }catch (CommonException e){
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }

    @Override
    public Map<String,Object> updateOrderStatus(String orderId, String voucherId) {
        try {
            if (orderId==null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                Order order = orderService.getOrder(orderId);
                WarehouseCell warehouseCell = warehouseCellService.getWarehouseCell(order.getWahoceId());
                Cabinet cabinet = cabinetService.getCabinet(warehouseCell.getCabinetId());
                //设置密码
                if(cabinet.getNo().substring(0,2).equals("WH")){
                    String SetPadPass =  cabinet.getId()+"-"+cabinet.getNo()+"-"+cabinet.getDoorNo()+"-"+warehouseCell.getNumber()+"-"+order.getCustTel()+"-"+orderId;
                    String CreatePasswordUrl = ZkPropertyUtil.get("CreatePassword");
                    String url=CreatePasswordUrl+"?SetPadPass="+SetPadPass;
                    utilService.httpRequest(url);
                }
                if(voucherId != null || voucherId !="" || "".equals(voucherId)){
                    voucherService.modifyVoucherState(voucherId,order.getId());
                }
                if("success".equals(message)){
                    message="toSuccess1";
                    if (ver.equals("2")) message="toSuccess2";
                }
                Map<String,Object> data = new HashMap<>();
                data.put("message",message);
                return data;
            }
        }catch (CommonException e){
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }
}
