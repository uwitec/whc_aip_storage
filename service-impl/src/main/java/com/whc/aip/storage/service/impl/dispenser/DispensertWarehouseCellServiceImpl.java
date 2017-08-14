package com.whc.aip.storage.service.impl.dispenser;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.warehouse.WarehouseCell;
import com.whc.aip.storage.service.dispenser.DispensertWarehouseCellService;
import com.whc.aip.storage.service.warehouse.WarehouseCellService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/22
 * Time：10:24
 */
@Service("DispensertWarehouseCellService")
public class DispensertWarehouseCellServiceImpl implements DispensertWarehouseCellService{
    @Resource
    private WarehouseCellService warehouseCellService;
    @Override
    public Map<String, Object> getDispensertWarehouseCell(String id) {
        WarehouseCell warehouseCellParams = new WarehouseCell();
        warehouseCellParams.setId(id);
        try {
            if (warehouseCellParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                WarehouseCell warehouseCell = warehouseCellService.getWarehouseCell(warehouseCellParams.getId());
                Map<String,Object> data = new HashMap<>();
                data.put("warehouseCell",warehouseCell);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }

    @Override
    public Map<String, Object> updateWarehouseCellStatus(String wahoceId,String status) {
        WarehouseCell warehouseCellParams = warehouseCellService.getWarehouseCell(wahoceId);
        warehouseCellParams.setStatus(status);
        try {
            if (warehouseCellParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                int result = warehouseCellService.updateWarehouseCellStatus(warehouseCellParams);
                Map<String,Object> data = new HashMap<>();
                data.put("result",result);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }
}
