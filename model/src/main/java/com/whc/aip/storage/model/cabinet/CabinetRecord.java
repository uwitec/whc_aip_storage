package com.whc.aip.storage.model.cabinet;

import com.whc.aip.storage.model.base.BaseDO;

public class CabinetRecord extends BaseDO{
    private String id;

    private String orderId;

    private String cabinetId;

    private String createTime;

    private String wahoceId;

    private String queryTime;

    private String cabinetStatus;

    private String operator;

    private String returnTime;

    private String returnStatus;

    private String openTime;

    private String closTime;

    private String stateLock;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(String cabinetId) {
        this.cabinetId = cabinetId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getWahoceId() {
        return wahoceId;
    }

    public void setWahoceId(String wahoceId) {
        this.wahoceId = wahoceId;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getCabinetStatus() {
        return cabinetStatus;
    }

    public void setCabinetStatus(String cabinetStatus) {
        this.cabinetStatus = cabinetStatus;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(String returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getClosTime() {
        return closTime;
    }

    public void setClosTime(String closTime) {
        this.closTime = closTime;
    }

    public String getStateLock() {
        return stateLock;
    }

    public void setStateLock(String stateLock) {
        this.stateLock = stateLock;
    }
}