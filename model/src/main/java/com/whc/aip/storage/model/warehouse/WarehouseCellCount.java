package com.whc.aip.storage.model.warehouse;

import com.whc.aip.storage.model.base.BaseDO;

/**
 * Created by Administrator on 2017/5/25.
 */
public class WarehouseCellCount extends BaseDO{
    private String wahoId;

    private String allCabi;

    private String smaCabi;

    private String medCabi;

    private String bigCabi;

    public String getWahoId() {
        return wahoId;
    }

    public void setWahoId(String wahoId) {
        this.wahoId = wahoId;
    }

    public String getAllCabi() {
        return allCabi;
    }

    public void setAllCabi(String allCabi) {
        this.allCabi = allCabi;
    }

    public String getSmaCabi() {
        return smaCabi;
    }

    public void setSmaCabi(String smaCabi) {
        this.smaCabi = smaCabi;
    }

    public String getMedCabi() {
        return medCabi;
    }

    public void setMedCabi(String medCabi) {
        this.medCabi = medCabi;
    }

    public String getBigCabi() {
        return bigCabi;
    }

    public void setBigCabi(String bigCabi) {
        this.bigCabi = bigCabi;
    }
}
