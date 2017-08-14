package com.whc.aip.storage.model.cabinet;

import com.whc.aip.storage.model.base.BaseDO;

public class Cabinet extends BaseDO {
    private String id;

    private String no;

    private String status;

    private String isDel;

    private String password;

    private String doorNo;

    private String wahoId;

    private String supperPassword;

    private String cabiId;

    private String wahoceId;

    private String openTime;

    private String closTime;

    private String stateLock;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getWahoId() {
        return wahoId;
    }

    public void setWahoId(String wahoId) {
        this.wahoId = wahoId;
    }

    public String getSupperPassword() {
        return supperPassword;
    }

    public void setSupperPassword(String supperPassword) {
        this.supperPassword = supperPassword;
    }

    public String getCabiId() {
        return cabiId;
    }

    public void setCabiId(String cabiId) {
        this.cabiId = cabiId;
    }

    public String getWahoceId() {
        return wahoceId;
    }

    public void setWahoceId(String wahoceId) {
        this.wahoceId = wahoceId;
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