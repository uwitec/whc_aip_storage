package com.whc.aip.storage.service.dispenser;

import com.wanhuchina.common.code.TxResultResponse;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/27.
 */
public interface DispensertWahoceCabinetService {
    Map<String, Object> getDispensertWahoceCabinet(String wahoceId, String openId, String wahoId);
}
