package com.whc.aip.storage.service.voucher;

import com.wanhuchina.common.exception.CommonException;

/**
 * Created by Administrator on 2017/6/3.
 */
public interface VoucherService {
    void modifyVoucherState(String id,String orderId) throws CommonException;
}
