package com.whc.aip.storage.service.impl;

import com.google.common.base.Strings;
import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.storage.WeigateDoorMapper;
import com.whc.aip.storage.dao.storage.WeigateDoorRecordMapper;
import com.whc.aip.storage.model.storage.WeigateDoorRecord;
import com.whc.aip.storage.model.storage.weigateDoor;
import com.whc.aip.storage.model.storage.weigateDoorExample;
import com.whc.aip.storage.service.storage.WeigateDoorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/21
 * Time：16:44
 */
@Service("weigateDoorService")
public class WeigateDoorServiceImpl implements WeigateDoorService {

    @Resource
    private WeigateDoorMapper weigateDoorMapper;
    @Resource
    private WeigateDoorRecordMapper weigateDoorRecordMapper;

    @Override
    public weigateDoor getWeigateByDeviceId(String deviceId, String isdel) throws CommonException {
        weigateDoor weigateDoor = new weigateDoor();
        if(!Strings.isNullOrEmpty(deviceId) && !Strings.isNullOrEmpty(isdel)){
            weigateDoorExample example = new weigateDoorExample();
            weigateDoorExample.Criteria criteria = example.createCriteria();
            criteria.andDeviceNoEqualTo(deviceId).andIsDelEqualTo(isdel);
            List<weigateDoor> weigateDoors = weigateDoorMapper.selectByExample(example);
            for (weigateDoor door: weigateDoors
                 ) {
                weigateDoor = door;

            }
            return weigateDoor;
        }else{
            throw new CommonException(CommonCode.DATA_NOT_FOUND.getCode(),"入参为空");
        }

    }

    @Override
    public int insWeigateDoorRecord(WeigateDoorRecord weigateDoorRecord) throws CommonException {
        try {
            if(weigateDoorRecord!=null){
                int index = weigateDoorRecordMapper.insertSelective(weigateDoorRecord);
                return index;
            }else{
                throw new CommonException(CommonCode.DATA_NOT_FOUND.getCode(),"入参为空");
            }
        } catch (CommonException e) {
            throw new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),"添加门禁记录异常");
        }
    }
}
