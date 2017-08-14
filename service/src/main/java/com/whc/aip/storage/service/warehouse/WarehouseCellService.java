package com.whc.aip.storage.service.warehouse;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.member.Member;
import com.whc.aip.storage.model.voucher.VoucherMember;
import com.whc.aip.storage.model.wahoce.ImmediateWahocePrice;
import com.whc.aip.storage.model.warehouse.*;

import java.util.List;

/**
 * Created by Administrator on 2017/5/25.
 */
public interface WarehouseCellService {
    List<WarehouseCellCount> getWahouseCellCount(WarehouseCellCount warehouseCellCountParams) throws CommonException;
    List<WarehouseCellInfo> getWarehouseCellInfo(WarehouseCellInfo warehouseCellInfoParams) throws CommonException;
    List<Wahoce> getWahoce(Wahoce wahoceParams) throws CommonException;
    List<VoucherMember> getMemberVoucher(Member memberParams) throws CommonException;
    WarehouseCell getWahoId(String wahoceId) throws CommonException;
    WarehouseCell getWarehouseCell(String id) throws CommonException;
    List<ImmediateWahocePrice> getImmediateWahocePrice(ImmediateWahocePrice immediateWahocePrice);
    int updateWarehouseCellStatus(WarehouseCell warehouseCellParams);
}
