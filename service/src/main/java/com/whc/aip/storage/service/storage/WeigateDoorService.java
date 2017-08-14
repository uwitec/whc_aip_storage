package com.whc.aip.storage.service.storage;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.storage.WeigateDoorRecord;
import com.whc.aip.storage.model.storage.weigateDoor;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/21
 * Time：16:42
 */
public interface WeigateDoorService {

    weigateDoor getWeigateByDeviceId(String deviceId, String isdel) throws CommonException;

    int insWeigateDoorRecord(WeigateDoorRecord weigateDoorRecord) throws CommonException;
}
