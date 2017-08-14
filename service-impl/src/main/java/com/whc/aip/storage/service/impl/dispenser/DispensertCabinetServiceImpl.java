package com.whc.aip.storage.service.impl.dispenser;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.cabinet.Cabinet;
import com.whc.aip.storage.model.cabinet.CabinetRecord;
import com.whc.aip.storage.model.cabinet.CabinetRecordNumberLock;
import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.service.cabinet.CabinetService;
import com.whc.aip.storage.service.dispenser.DispensertCabinetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/22
 * Time：13:07
 */
@Service("DispensertCabinetService")
public class DispensertCabinetServiceImpl implements DispensertCabinetService{
    @Resource
    private CabinetService cabinetService;
    @Override
    public Map<String, Object> getCabinet(String id) {
        Cabinet cabinetParams = new Cabinet();
        cabinetParams.setId(id);
        try {
            if (cabinetParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                Cabinet cabinet = cabinetService.getCabinet(cabinetParams.getId());
                Map<String,Object> data = new HashMap<>();
                data.put("cabinet",cabinet);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }

    @Override
    public Map<String, Object> getCabinetRecordNumberLock(String orderId) {
        CabinetRecordNumberLock cabinetRecordNumberLockParams = new CabinetRecordNumberLock();
        cabinetRecordNumberLockParams.setOrderId(orderId);
        try {
            if (cabinetRecordNumberLockParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(),"参数错误");
            }else {
                CabinetRecordNumberLock cabinetRecordNumberLock = cabinetService.getCabinetRecordNumberLock(cabinetRecordNumberLockParams.getOrderId());
                Map<String,Object> data = new HashMap<>();
                data.put("cabinetRecordNumberLock",cabinetRecordNumberLock);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部错误");
        }
    }

    @Override
    public CabinetRecord getCabinetRecordId(CabinetRecord cabinetRecord) {
        try {
            if (cabinetRecord == null) {
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(), "参数为空");
            } else {
                cabinetRecord = cabinetService.getCabinetRecordId(cabinetRecord);
                return cabinetRecord;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(), "服务器内部错误");
        }
    }

    @Override
    public Map<String, Object> updateCabinetStatus(String cabinetId,String status) {
        Cabinet cabinetParams = cabinetService.getCabinet(cabinetId);
        cabinetParams.setStatus(status);
        try {
           if (cabinetParams == null){
               throw new CommonException(CommonCode.PARAM_ERROR.getCode(), "参数为空");
           }else {
               int result = cabinetService.updateCabinetStatus(cabinetParams);
               Map<String,Object> data = new HashMap<>();
               data.put("result",result);
               return data;
           }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(), "服务器内部错误");
        }
    }

    @Override
    public Map<String, Object> getWeigateCabinetRecordList(String orderId) {
        CabinetRecord cabinetRecordParams = new CabinetRecord();
        cabinetRecordParams.setOrderId(orderId);
        try {
            if (cabinetRecordParams == null){
                throw new CommonException(CommonCode.PARAM_ERROR.getCode(), "参数为空");
            }else {
                List<CabinetRecord> weigateCabinetRecordList = cabinetService.getWeigateCabinetRecordList(cabinetRecordParams.getOrderId());
                Map<String,Object> data = new HashMap<>();
                data.put("weigateCabinetRecordList",weigateCabinetRecordList);
                return data;
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(), "服务器内部错误");
        }
    }
}
