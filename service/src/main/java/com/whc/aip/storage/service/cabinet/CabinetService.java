package com.whc.aip.storage.service.cabinet;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.cabinet.Cabinet;
import com.whc.aip.storage.model.cabinet.CabinetRecord;
import com.whc.aip.storage.model.cabinet.CabinetRecordNumberLock;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
public interface CabinetService {
    Cabinet getCabinet(String id) throws CommonException;
    CabinetRecordNumberLock getCabinetRecordNumberLock(String orderId) throws CommonException;
    CabinetRecord getCabinetRecordId(CabinetRecord cabinetRecord) throws CommonException;
    int updateCabinetStatus(Cabinet cabinet) throws CommonException;
    List<CabinetRecord> getWeigateCabinetRecordList(String cabinetRecordParams) throws CommonException;
}
