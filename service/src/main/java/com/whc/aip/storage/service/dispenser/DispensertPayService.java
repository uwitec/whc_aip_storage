package com.whc.aip.storage.service.dispenser;

import com.wanhuchina.common.code.TxResultResponse;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/27.
 */
public interface DispensertPayService{
    Map<String,Object> getDispensertPay(String unit, String number, String openId, String wahoceId, String total,
                                        String memberName, String memberTel, String wahoId,
                                        String wahoType, String rentalTime);
    Map<String,Object> updateOrderStatus(String orderId,String voucherId);
}
