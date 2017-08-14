package com.whc.aip.storage.model.voucher;

import com.whc.aip.storage.model.base.BaseDO;

/**
 * Created by Administrator on 2017/5/26.
 */
public class VoucherMember extends BaseDO{
    private String voucherId;

    private String voucherCode;

    private String voucherUnit;

    private String voucherAmount;

    private String memberId;

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public String getVoucherUnit() {
        return voucherUnit;
    }

    public void setVoucherUnit(String voucherUnit) {
        this.voucherUnit = voucherUnit;
    }

    public String getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(String voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
