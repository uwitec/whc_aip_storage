package com.whc.aip.storage.service.dispenser;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/27.
 */
public interface DispensertWarehouseService {
    Map<String, Object> getDispensertWarehouse(String wahoId);
    Map<String, Object> getDispensertWarehouseInfo(String wahoId);
    Map<String, Object> updateWarehouseQRCodeUrl(String wahoId,String qrcodeUrl);
}
