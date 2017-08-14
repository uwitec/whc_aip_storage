package com.whc.aip.storage.service.warehouse;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.model.warehouse.WarehouseList;

import java.util.List;

/**
 * Created by Administrator on 2017/5/18.
 */
public interface WarehouseService {
    //获取门店列表
    List<Warehouse> getwarehouseList(WarehouseList warehouseParams) throws CommonException;
    //根据门店id获取门店信息
    List<Warehouse> getWarehouseInfo(Warehouse warehouseParams) throws CommonException;
    //根据门店Id获取门店type
    Warehouse getWarehouseType(String wahoId) throws CommonException;
    //根据门店ID获取门店实体
    Warehouse getWarehouse(String wahoId) throws CommonException;
    //根据门店id和QrcodeUrl更新门店QrcodeUrl
    int updateWarehouseQRCodeUrl(Warehouse warehouse) throws CommonException;


}
