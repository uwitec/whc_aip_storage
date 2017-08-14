package com.whc.aip.storage.model.storage;

import com.whc.aip.storage.model.base.BaseDO;

import java.math.BigDecimal;

public class weigateDoor extends BaseDO{
    private String doorId;

    private String commId;

    private BigDecimal lati;

    private BigDecimal longi;

    private Long verifyDistance;

    private String deviceNo;

    private String status;

    private String isDel;

    public String getDoorId() {
        return doorId;
    }

    public void setDoorId(String doorId) {
        this.doorId = doorId;
    }

    public String getCommId() {
        return commId;
    }

    public void setCommId(String commId) {
        this.commId = commId;
    }

    public BigDecimal getLati() {
        return lati;
    }

    public void setLati(BigDecimal lati) {
        this.lati = lati;
    }

    public BigDecimal getLongi() {
        return longi;
    }

    public void setLongi(BigDecimal longi) {
        this.longi = longi;
    }

    public Long getVerifyDistance() {
        return verifyDistance;
    }

    public void setVerifyDistance(Long verifyDistance) {
        this.verifyDistance = verifyDistance;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }
}