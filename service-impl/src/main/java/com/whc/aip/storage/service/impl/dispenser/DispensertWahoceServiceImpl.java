package com.whc.aip.storage.service.impl.dispenser;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.wahoce.ImmediateWahocePrice;
import com.whc.aip.storage.model.wahoce.IntelligenceWahocePrice;
import com.whc.aip.storage.model.wahoce.WahocePriceParam;
import com.whc.aip.storage.model.wahoce.WahoceTypePrice;
import com.whc.aip.storage.model.warehouse.WahoceType;
import com.whc.aip.storage.service.dispenser.DispensertWahoceService;
import com.whc.aip.storage.service.wahoce.WahoceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/27
 * Time：17:00
 */
@Service("DispensertWahoceService")
public class DispensertWahoceServiceImpl implements DispensertWahoceService{
    @Resource
    private WahoceService wahoceService;
    @Override
    public Map<String, Object> getWahoceTypePrice(String wahoId, String watyId) {
        WahoceTypePrice wahoceTypePriceParams = new WahoceTypePrice();
        wahoceTypePriceParams.setWahoId(wahoId);
        wahoceTypePriceParams.setWatyId(watyId);
        try {
            if (wahoceTypePriceParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                WahoceTypePrice wahoceTypePrice = wahoceService.getWahoceTypePrice(wahoceTypePriceParams);
                Map<String,Object> data = new HashMap<>();
                data.put("wahoceTypePrice",wahoceTypePrice);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }

    @Override
    public Map<String, Object> getImmediateWahocePrice(String wahoId) {
        ImmediateWahocePrice immediateWahocePriceParams = new ImmediateWahocePrice();
        immediateWahocePriceParams.setWahoId(wahoId);
        try {
            if (immediateWahocePriceParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                List<ImmediateWahocePrice> immediateWahocePrices = wahoceService.getImmediateWahocePrice(immediateWahocePriceParams);
                Map<String,Object> data = new HashMap<>();
                data.put("immediateWahocePrices",immediateWahocePrices);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }

    @Override
    public Map<String, Object> getIntelligenceWahocePrice(String wahoId) {
        IntelligenceWahocePrice intelligenceWahocePriceParams = new IntelligenceWahocePrice();
        intelligenceWahocePriceParams.setWahoId(wahoId);
        try {
            if (intelligenceWahocePriceParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                List<IntelligenceWahocePrice> intelligenceWahocePrices = wahoceService.getIntelligenceWahocePrice(intelligenceWahocePriceParams);
                Map<String,Object> data = new HashMap<>();
                data.put("intelligenceWahocePrices",intelligenceWahocePrices);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }

    /**
     * 7-18胜战需要
     * @param warehouseId
     * @return
     * @throws CommonException
     */
    @Override
    public List<WahocePriceParam> selWahocePriceParam(String warehouseId) throws CommonException {
        try {
            if(warehouseId== null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参warehouseId为空");
            }else{

                List<WahocePriceParam> wahocePriceParams = wahoceService.selWahocePriceParam(warehouseId);
                if(wahocePriceParams.size()==0){
                    throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"返回值为空");
                }else{
                    return wahocePriceParams;
                }
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }

    }

    @Override
    public List<WahoceType> selWahoceTypeByStatus(String status) throws CommonException {
        try {
            if(status== null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参status为空");
            }else{

                List<WahoceType> wahoceType = wahoceService.selWahoceTypeByStatus(status);
                if(wahoceType ==null){
                    throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"返回值为空");
                }else{
                    return wahoceType;
                }
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),CommonCode.SQL_SELECT_ERROR.getMsg());
        }

    }
}
