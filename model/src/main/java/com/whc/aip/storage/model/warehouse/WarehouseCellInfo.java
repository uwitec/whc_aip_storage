package com.whc.aip.storage.model.warehouse;

import com.whc.aip.storage.model.base.BaseDO;

/**
 * Created by Administrator on 2017/5/26.
 */
public class WarehouseCellInfo extends BaseDO{
    private String waceId;

    private String wahoId;

    private String wahoceNumber;

    private String wahoceSize;

    private String wahoceStatus;

    private String wahoceTpe;

    private String wahoceKind;

    private String wahoceName;

    private String waceTimePrice;

    public String getWaceId() {
        return waceId;
    }

    public void setWaceId(String waceId) {
        this.waceId = waceId;
    }

    public String getWahoId() {
        return wahoId;
    }

    public void setWahoId(String wahoId) {
        this.wahoId = wahoId;
    }

    public String getWahoceNumber() {
        return wahoceNumber;
    }

    public void setWahoceNumber(String wahoceNumber) {
        this.wahoceNumber = wahoceNumber;
    }

    public String getWahoceSize() {
        return wahoceSize;
    }

    public void setWahoceSize(String wahoceSize) {
        this.wahoceSize = wahoceSize;
    }

    public String getWahoceStatus() {
        return wahoceStatus;
    }

    public void setWahoceStatus(String wahoceStatus) {
        this.wahoceStatus = wahoceStatus;
    }

    public String getWahoceTpe() {
        return wahoceTpe;
    }

    public void setWahoceTpe(String wahoceTpe) {
        this.wahoceTpe = wahoceTpe;
    }

    public String getWahoceKind() {
        return wahoceKind;
    }

    public void setWahoceKind(String wahoceKind) {
        this.wahoceKind = wahoceKind;
    }

    public String getWahoceName() {
        return wahoceName;
    }

    public void setWahoceName(String wahoceName) {
        this.wahoceName = wahoceName;
    }

    public String getWaceTimePrice() {
        return waceTimePrice;
    }

    public void setWaceTimePrice(String waceTimePrice) {
        this.waceTimePrice = waceTimePrice;
    }
}
