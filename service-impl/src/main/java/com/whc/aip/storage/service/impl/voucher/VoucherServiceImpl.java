package com.whc.aip.storage.service.impl.voucher;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.voucher.VoucherMapper;
import com.whc.aip.storage.model.voucher.Voucher;
import com.whc.aip.storage.service.voucher.VoucherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/3.
 */
@Service("VoucherService")
public class VoucherServiceImpl implements VoucherService {
    @Resource
    private VoucherMapper voucherMapper;
    @Override
    public void modifyVoucherState(String id,String orderId) throws CommonException {
        Voucher voucher = voucherMapper.selectByPrimaryKey(id);
        if (voucher != null || "".equals(voucher)){
            voucher.setStatus("4");
            voucher.setOrderId(orderId);
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            voucher.setUsedTime(dateFormat.format(now));
            voucherMapper.updateByPrimaryKeySelective(voucher);
        }
    }
}
