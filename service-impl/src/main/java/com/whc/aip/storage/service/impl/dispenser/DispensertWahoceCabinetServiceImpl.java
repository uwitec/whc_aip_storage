package com.whc.aip.storage.service.impl.dispenser;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.member.Member;
import com.whc.aip.storage.model.voucher.VoucherMember;
import com.whc.aip.storage.model.wahoce.ImmediateWahocePrice;
import com.whc.aip.storage.model.warehouse.Wahoce;
import com.whc.aip.storage.service.dispenser.DispensertWahoceCabinetService;
import com.whc.aip.storage.service.warehouse.WarehouseCellService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/27.
 */
@Service("DispensertWahoceCabinetService")
public class DispensertWahoceCabinetServiceImpl implements DispensertWahoceCabinetService {
    @Resource
    private WarehouseCellService warehouseCellService;
    @Override
    public Map<String, Object> getDispensertWahoceCabinet(String wahoceId, String openId, String wahoId) {
        Wahoce wahoceParams = new Wahoce();
        wahoceParams.setWahoceId(wahoceId);
        Member memberParams = new Member();
        memberParams.setOpenId(openId);
        ImmediateWahocePrice immediateWahocePriceParams = new ImmediateWahocePrice();
        immediateWahocePriceParams.setWahoId(wahoId);
        try{
            if (wahoceParams==null || memberParams == null || immediateWahocePriceParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                List<Wahoce> wahoceInfo = warehouseCellService.getWahoce(wahoceParams);
                List<VoucherMember> listMemberVoucher = warehouseCellService.getMemberVoucher(memberParams);
                List<ImmediateWahocePrice> immediateWahocePrices = warehouseCellService.getImmediateWahocePrice(immediateWahocePriceParams);
                Map<String,Object> data = new HashMap<>();
                data.put("wahoceInfo",wahoceInfo);
                data.put("listMemberVoucher",listMemberVoucher);
                data.put("immediateWahocePrices",immediateWahocePrices);
                return data;
            }
        }catch (CommonException e){
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }
}
