package com.whc.aip.storage.model.warehouse;

import com.whc.aip.storage.model.base.BaseDO;

public class WahoCellRecord extends BaseDO {
    private String id;

    private String wahoCellRecordStart;

    private String orderId;

    private String wahoCellRecordEnd;

    private String wahoceId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWahoCellRecordStart() {
        return wahoCellRecordStart;
    }

    public void setWahoCellRecordStart(String wahoCellRecordStart) {
        this.wahoCellRecordStart = wahoCellRecordStart;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getWahoCellRecordEnd() {
        return wahoCellRecordEnd;
    }

    public void setWahoCellRecordEnd(String wahoCellRecordEnd) {
        this.wahoCellRecordEnd = wahoCellRecordEnd;
    }

    public String getWahoceId() {
        return wahoceId;
    }

    public void setWahoceId(String wahoceId) {
        this.wahoceId = wahoceId;
    }
}