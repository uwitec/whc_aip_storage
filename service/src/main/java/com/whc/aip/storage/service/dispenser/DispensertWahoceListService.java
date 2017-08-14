package com.whc.aip.storage.service.dispenser;

import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.model.warehouse.WarehouseList;

import java.util.List;

/**
 * Created by Administrator on 2017/5/27.
 */
public interface DispensertWahoceListService {
    List<Warehouse> getDispensertWahoceList(String keyWord, String wahoType);
}
