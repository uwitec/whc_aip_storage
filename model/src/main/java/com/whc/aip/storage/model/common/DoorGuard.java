package com.whc.aip.storage.model.common;

import com.whc.aip.storage.model.base.BaseDO;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/21
 * Time：10:52
 */
public class DoorGuard extends BaseDO{

    private String doorId;
    private String deviceNo;
    private String name;


    public String getDoorId() {
        return doorId;
    }

    public void setDoorId(String doorId) {
        this.doorId = doorId;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
