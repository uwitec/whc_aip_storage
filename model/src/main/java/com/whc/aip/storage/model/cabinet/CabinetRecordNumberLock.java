package com.whc.aip.storage.model.cabinet;

import com.whc.aip.storage.model.base.BaseDO;

/**
 * Created by WangHu
 * Email：wanghu@wanhuchina.com
 * Date：2017/6/22
 * Time：14:30
 */
public class CabinetRecordNumberLock extends BaseDO{
    private String orderId;
    private String numberLock;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getNumberLock() {
        return numberLock;
    }

    public void setNumberLock(String numberLock) {
        this.numberLock = numberLock;
    }
}
