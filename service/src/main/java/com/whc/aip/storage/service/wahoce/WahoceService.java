package com.whc.aip.storage.service.wahoce;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.wahoce.ImmediateWahocePrice;
import com.whc.aip.storage.model.wahoce.IntelligenceWahocePrice;
import com.whc.aip.storage.model.wahoce.WahocePriceParam;
import com.whc.aip.storage.model.wahoce.WahoceTypePrice;
import com.whc.aip.storage.model.warehouse.WahoceType;

import java.util.List;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/27
 * Time：17:07
 */
public interface WahoceService {
    WahoceTypePrice getWahoceTypePrice(WahoceTypePrice wahoceTypePrice);
    List<ImmediateWahocePrice> getImmediateWahocePrice(ImmediateWahocePrice immediateWahocePriceParams);
    List<IntelligenceWahocePrice> getIntelligenceWahocePrice(IntelligenceWahocePrice intelligenceWahocePriceParams);

    List<WahocePriceParam> selWahocePriceParam(String warehouseId) throws CommonException;

    List<WahoceType> selWahoceTypeByStatus(String status) throws CommonException;
}
