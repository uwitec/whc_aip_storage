package com.whc.aip.storage.model.wahoce;

import com.whc.aip.storage.model.base.BaseDO;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/7/18
 * Time：16:00
 */
public class WahocePriceParam extends BaseDO {

    private String typeCode;
    private String typeName;
    private String size;
    private String count;
    private String dayPrice;
    private String monthPrice;
    private String halfPrice;
    private String yearPrice;
    private String specialPrice;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(String dayPrice) {
        this.dayPrice = dayPrice;
    }

    public String getMonthPrice() {
        return monthPrice;
    }

    public void setMonthPrice(String monthPrice) {
        this.monthPrice = monthPrice;
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
}
