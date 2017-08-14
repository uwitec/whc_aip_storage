package com.whc.aip.storage.service.impl.dispenser;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.model.warehouse.WarehouseList;
import com.whc.aip.storage.service.dispenser.DispensertWahoceListService;
import com.whc.aip.storage.service.warehouse.WarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/27.
 */
@Service("DispensertWahoceListService")
public class DispensertWahoceListServiceImpl implements DispensertWahoceListService{
    @Resource
    private WarehouseService warehouseService;
    @Override
    public List<Warehouse> getDispensertWahoceList(String keyWord, String wahoType) {
        WarehouseList warehouseParams = new WarehouseList();
        warehouseParams.setKeyWord(keyWord);
        warehouseParams.setType(wahoType);
        try {
            if(warehouseParams==null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else{
                List<Warehouse> warehouses = warehouseService.getwarehouseList(warehouseParams);
                return warehouses;
            }
        }catch (CommonException e){
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }
}
