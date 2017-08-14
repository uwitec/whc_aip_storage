package com.whc.aip.storage.model.warehouse;

import com.whc.aip.storage.model.base.BaseDO;

public class WarehouseCell extends BaseDO{
    private String id;

    private String wahoId;

    private String number;

    private String size;

    private String image1;

    private String image2;

    private String image3;

    private String status;

    private String introduce;

    private String type;

    private String price;

    private String discountPrice;

    private String dprice;

    private String discountDprice;

    private String cabinetId;

    private String kind;

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDprice() {
        return dprice;
    }

    public void setDprice(String dprice) {
        this.dprice = dprice;
    }

    public String getDiscountDprice() {
        return discountDprice;
    }

    public void setDiscountDprice(String discountDprice) {
        this.discountDprice = discountDprice;
    }

    public String getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(String cabinetId) {
        this.cabinetId = cabinetId;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}