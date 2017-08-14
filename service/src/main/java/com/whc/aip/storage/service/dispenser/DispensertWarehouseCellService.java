package com.whc.aip.storage.service.dispenser;

import java.util.Map;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/22
 * Time：10:16
 */
public interface DispensertWarehouseCellService {
    Map<String, Object> getDispensertWarehouseCell(String id);
    Map<String, Object> updateWarehouseCellStatus(String wahoceId,String status);
}
