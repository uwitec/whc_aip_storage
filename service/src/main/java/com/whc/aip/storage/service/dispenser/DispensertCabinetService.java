package com.whc.aip.storage.service.dispenser;

import com.whc.aip.storage.model.cabinet.CabinetRecord;

import java.util.Map;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/22
 * Time：12:10
 */
public interface DispensertCabinetService {
    Map<String, Object> getCabinet(String id);
    Map<String, Object> getCabinetRecordNumberLock(String orderId);
    CabinetRecord getCabinetRecordId(CabinetRecord cabinetRecord);
    Map<String, Object> updateCabinetStatus(String cabinetId,String status);
    Map<String, Object> getWeigateCabinetRecordList(String orderId);
}
