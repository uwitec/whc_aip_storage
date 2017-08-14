package com.whc.aip.storage.service.dispenser;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.wahoce.WahocePriceParam;
import com.whc.aip.storage.model.warehouse.WahoceType;

import java.util.List;
import java.util.Map;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/27
 * Time：16:43
 */
public interface DispensertWahoceService {
    Map<String, Object> getWahoceTypePrice(String wahoId,String watyId);
    Map<String, Object> getImmediateWahocePrice(String wahoId);
    Map<String, Object> getIntelligenceWahocePrice(String wahoId);

    List<WahocePriceParam> selWahocePriceParam(String warehouseId) throws CommonException;

    List<WahoceType> selWahoceTypeByStatus(String status) throws CommonException;
}
