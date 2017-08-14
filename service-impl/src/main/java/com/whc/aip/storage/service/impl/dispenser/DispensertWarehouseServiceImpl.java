package com.whc.aip.storage.service.impl.dispenser;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.model.warehouse.WarehouseCellCount;
import com.whc.aip.storage.model.warehouse.WarehouseCellInfo;
import com.whc.aip.storage.service.dispenser.DispensertWarehouseService;
import com.whc.aip.storage.service.warehouse.WarehouseCellService;
import com.whc.aip.storage.service.warehouse.WarehouseService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/27.
 */
@Service("DispensertWarehouseService")
public class DispensertWarehouseServiceImpl implements DispensertWarehouseService{
    @Resource
    private WarehouseCellService warehouseCellService;
    @Resource
    private WarehouseService warehouseService;
    @Override
    public Map<String, Object> getDispensertWarehouse(String wahoId) {
        WarehouseCellInfo warehouseCellInfoParams = new WarehouseCellInfo();
        warehouseCellInfoParams.setWahoId(wahoId);
        WarehouseCellCount WarehouseCellCountParams = new WarehouseCellCount();
        WarehouseCellCountParams.setWahoId(wahoId);
        Warehouse warehouseParams = new Warehouse();
        warehouseParams.setId(wahoId);
        try{
            if (warehouseCellInfoParams==null || WarehouseCellCountParams == null || warehouseParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                List<WarehouseCellInfo> warehouseCellInfos = warehouseCellService.getWarehouseCellInfo(warehouseCellInfoParams);
                List<WarehouseCellCount> warehouseCellCounts = warehouseCellService.getWahouseCellCount(WarehouseCellCountParams);
                List<Warehouse> warehouses = warehouseService.getWarehouseInfo(warehouseParams);
                Map<String,Object> data = new HashMap<>();
                data.put("warehouseCellInfos",warehouseCellInfos);
                data.put("warehouseCellCounts",warehouseCellCounts);
                data.put("warehouses",warehouses);
                return data;
            }
        }catch (CommonException e){
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }
    @Override
    public Map<String, Object> getDispensertWarehouseInfo(String wahoId) {
        Warehouse warehouseParams = new Warehouse();
        warehouseParams.setId(wahoId);
        try {
            if (warehouseParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                Warehouse Warehouse = warehouseService.getWarehouse(warehouseParams.getId());
                Map<String,Object> data = new HashMap<>();
                data.put("Warehouse",Warehouse);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }

    @Override
    public Map<String, Object> updateWarehouseQRCodeUrl(String wahoId, String qrcodeUrl) {
        Warehouse warehouseParams = new Warehouse();
        warehouseParams.setId(wahoId);
        warehouseParams.setQrcodeUrl(qrcodeUrl);
        try {
            if (warehouseParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                int result = warehouseService.updateWarehouseQRCodeUrl(warehouseParams);
                Map<String,Object> data = new HashMap<>();
                data.put("result",result);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }
}
