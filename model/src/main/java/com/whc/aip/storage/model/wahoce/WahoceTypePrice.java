package com.whc.aip.storage.model.wahoce;

import com.whc.aip.storage.model.base.BaseDO;

public class WahoceTypePrice extends BaseDO{
    private String id;

    private String wahoId;

    private String watyId;

    private String monthPrice;

    private String dayPrice;

    private String halfPrice;

    private String yearPrice;

    private String specialPrice;

    private String timePrice;

    private String depositPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWahoId() {
        return wahoId;
    }

    public void setWahoId(String wahoId) {
        this.wahoId = wahoId;
    }

    public String getWatyId() {
        return watyId;
    }

    public void setWatyId(String watyId) {
        this.watyId = watyId;
    }

    public String getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(String monthPrice) {
        this.monthPrice = monthPrice;
    }

    public String getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(String dayPrice) {
        this.dayPrice = dayPrice;
    }

    public String getHalfPrice() {
        return halfPrice;
    }

    public void setHalfPrice(String halfPrice) {
        this.halfPrice = halfPrice;
    }

    public String getYearPrice() {
        return yearPrice;
    }

    public void setYearPrice(String yearPrice) {
        this.yearPrice = yearPrice;
    }

    public String getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(String specialPrice) {
        this.specialPrice = specialPrice;
    }

    public String getTimePrice() {
        return timePrice;
    }

    public void setTimePrice(String timePrice) {
        this.timePrice = timePrice;
    }

    public String getDepositPrice() {
        return depositPrice;
    }

    public void setDepositPrice(String depositPrice) {
        this.depositPrice = depositPrice;
    }
}