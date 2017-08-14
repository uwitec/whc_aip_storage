package com.whc.aip.storage.controller.pay;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.code.TxResultResponse;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.service.dispenser.DispensertPayService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("PayController")
public class PayController {
    private static final org.slf4j.Logger log= LoggerFactory.getLogger(PayController.class);
    @Resource
    private DispensertPayService dispensertPayService;
    //订单支付接口
    @RequestMapping(value = "/getPayInfo",method = RequestMethod.POST)
    public TxResultResponse getPayInfo(@RequestParam String unit, @RequestParam String number,
        @RequestParam String openId, @RequestParam String wahoceId, @RequestParam String total,
        @RequestParam String memberName,@RequestParam String memberTel,@RequestParam String wahoId, @RequestParam String wahoType,
        @RequestParam String rentalTime){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String,Object> data = dispensertPayService.getDispensertPay(unit,number,openId,wahoceId,total,memberName,memberTel,wahoId,wahoType,rentalTime);
            resultResponse.setData(data);
            return resultResponse;
        } catch (CommonException e) {
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
    //更新订单状态接口
    @RequestMapping(value = "/updateOrderStatus",method = RequestMethod.POST)
    public TxResultResponse updateOrderStatus(@RequestParam String orderId,@RequestParam String voucherId){
        TxResultResponse resultResponse = new TxResultResponse(CommonCode.SUCCESS.getCode(),"操作成功");
        try {
            Map<String, Object> data = dispensertPayService.updateOrderStatus(orderId, voucherId);
            resultResponse.setData(data);
            return resultResponse;
        }catch (CommonException e){
            return new TxResultResponse(e.getCode(),e.getMsg());
        } catch (Exception e) {
            return new TxResultResponse(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
}
