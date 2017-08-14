package com.whc.aip.storage.service.impl.warehouse;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.warehouse.WarehouseMapper;
import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.model.warehouse.WarehouseList;
import com.whc.aip.storage.service.warehouse.WarehouseService;
import org.springframework.jca.cci.core.InteractionCallback;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/18.
 */
@Service("WarehouseService")
public class WarehouseServiceImpl implements WarehouseService {

    @Resource
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> getwarehouseList(WarehouseList warehouseParams) throws CommonException {
        List<Warehouse> warehouseList = warehouseMapper.getWarehouseList(warehouseParams);
        return warehouseList;

    }

    @Override
    public List<Warehouse> getWarehouseInfo(Warehouse warehouseParams) throws CommonException {
        List<Warehouse> warehouses = warehouseMapper.getWarehouseInfo(warehouseParams);
        return warehouses;
    }

    @Override
    public Warehouse getWarehouseType(String wahoId) throws CommonException {
        Warehouse warehouse = warehouseMapper.getWarehouseType(wahoId);
        return warehouse;
    }

    @Override
    public Warehouse getWarehouse(String wahoId) throws CommonException {
        Warehouse warehouse = warehouseMapper.selectByPrimaryKey(wahoId);
        return warehouse;
    }

    @Override
    public int updateWarehouseQRCodeUrl(Warehouse warehouse) throws CommonException {
        int result = warehouseMapper.updateByPrimaryKeySelective(warehouse);
        return result;
    }
}
