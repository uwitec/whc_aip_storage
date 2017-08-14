package com.whc.aip.storage.model.storage;

import com.whc.aip.storage.model.base.BaseDO;

public class WeigateDoorRecord extends BaseDO{
    private String doreId;

    private String doreUserId;

    private String doorId;

    private String doreTime;

    private String dore_open_type;

    public String getDoreId() {
        return doreId;
    }

    public void setDoreId(String doreId) {
        this.doreId = doreId;
    }

    public String getDoreUserId() {
        return doreUserId;
    }

    public void setDoreUserId(String doreUserId) {
        this.doreUserId = doreUserId;
    }

    public String getDoorId() {
        return doorId;
    }

    public void setDoorId(String doorId) {
        this.doorId = doorId;
    }

    public String getDoreTime() {
        return doreTime;
    }

    public void setDoreTime(String doreTime) {
        this.doreTime = doreTime;
    }

    public String getDore_open_type() {
        return dore_open_type;
    }

    public void setDore_open_type(String dore_open_type) {
        this.dore_open_type = dore_open_type;
    }
}