package com.whc.aip.storage.service.impl.warehouse;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.wahoce.ImmediateWahocePriceMapper;
import com.whc.aip.storage.dao.warehouse.WarehouseCellMapper;
import com.whc.aip.storage.model.member.Member;
import com.whc.aip.storage.model.voucher.VoucherMember;
import com.whc.aip.storage.model.wahoce.ImmediateWahocePrice;
import com.whc.aip.storage.service.warehouse.WarehouseCellService;
import com.whc.aip.storage.model.warehouse.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/25.
 */
@Service("WarehouseCellService")
public class WarehouseCellServiceImpl implements WarehouseCellService {
    @Resource
    private WarehouseCellMapper warehouseCellMapper;
    @Resource
    private ImmediateWahocePriceMapper immediateWahocePriceMapper;
    @Override
    public List<WarehouseCellCount> getWahouseCellCount(WarehouseCellCount warehouseCellCountParams) throws CommonException {
        List<WarehouseCellCount> warehouseCellCounts = warehouseCellMapper.getWahouseCellCount(warehouseCellCountParams);
        return warehouseCellCounts;
    }

    @Override
    public List<WarehouseCellInfo> getWarehouseCellInfo(WarehouseCellInfo warehouseCellInfoParams) throws CommonException {
        List<WarehouseCellInfo> warehouseCellInfos = warehouseCellMapper.getWarehouseCellInfo(warehouseCellInfoParams);
        return warehouseCellInfos;
    }

    @Override
    public List<Wahoce> getWahoce(Wahoce wahoceParams) throws CommonException {
        List<Wahoce> wahoces = warehouseCellMapper.getWahoce(wahoceParams);
        return wahoces;
    }

    @Override
    public List<VoucherMember> getMemberVoucher(Member memberParams) throws CommonException {
        List<VoucherMember> listMemberVoucher = warehouseCellMapper.getMemberVoucher(memberParams);
        return listMemberVoucher;
    }

    @Override
    public WarehouseCell getWahoId(String wahoceId) throws CommonException {
        WarehouseCell warehouseCell = warehouseCellMapper.getWahoId(wahoceId);
        return warehouseCell;
    }

    @Override
    public WarehouseCell getWarehouseCell(String id) throws CommonException {
        WarehouseCell warehouseCell = warehouseCellMapper.selectByPrimaryKey(id);
        return warehouseCell;
    }

    @Override
    public List<ImmediateWahocePrice> getImmediateWahocePrice(ImmediateWahocePrice immediateWahocePriceParams) {
        List<ImmediateWahocePrice> immediateWahocePrices = immediateWahocePriceMapper.getImmediateWahocePrice(immediateWahocePriceParams);
        return immediateWahocePrices;
    }

    @Override
    public int updateWarehouseCellStatus(WarehouseCell warehouseCellParams) {
        int result = warehouseCellMapper.updateByPrimaryKey(warehouseCellParams);
        return result;
    }
}
