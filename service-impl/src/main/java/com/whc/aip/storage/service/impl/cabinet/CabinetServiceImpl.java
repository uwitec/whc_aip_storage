package com.whc.aip.storage.service.impl.cabinet;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.cabinet.CabinetMapper;
import com.whc.aip.storage.dao.cabinet.CabinetRecordMapper;
import com.whc.aip.storage.model.cabinet.Cabinet;
import com.whc.aip.storage.model.cabinet.CabinetExample;
import com.whc.aip.storage.model.cabinet.CabinetRecord;
import com.whc.aip.storage.model.cabinet.CabinetRecordNumberLock;
import com.whc.aip.storage.service.cabinet.CabinetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
@Service("CabinetService")
public class CabinetServiceImpl implements CabinetService{
    @Resource
    private CabinetMapper cabinetMapper;
    @Resource
    private CabinetRecordMapper cabinetRecordMapper;
    @Override
    public Cabinet getCabinet(String id) throws CommonException {
        return cabinetMapper.getCabinet(id);
    }

    @Override
    public CabinetRecordNumberLock getCabinetRecordNumberLock(String orderId) throws CommonException {
        return cabinetRecordMapper.getCabinetRecordNumberLock(orderId);
    }

    @Override
    public CabinetRecord getCabinetRecordId(CabinetRecord cabinetRecord) throws CommonException {
        int index = cabinetRecordMapper.insertSelective(cabinetRecord);
        if(index == 1){
            return cabinetRecord;
        }else{
            throw  new CommonException(CommonCode.PARAM_ERROR.getCode(),CommonCode.PARAM_ERROR.getMsg());
        }
    }

    @Override
    public int updateCabinetStatus(Cabinet cabinet) throws CommonException {
        CabinetExample example = new CabinetExample();
        CabinetExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(cabinet.getId());
        try {
            int result = cabinetMapper.updateByExampleSelective(cabinet,example);
            if (result >0){
                return result;
            }else {
                return 0;
            }
        } catch (Exception e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),CommonCode.SQL_UPD_ERROR.getMsg());
        }
    }

    @Override
    public List<CabinetRecord> getWeigateCabinetRecordList(String orderId) throws CommonException {
        List<CabinetRecord> weigateCabinetRecordList = cabinetRecordMapper.getWeigateCabinetRecordList(orderId);
        return weigateCabinetRecordList;
    }
}
