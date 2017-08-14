package com.whc.aip.storage.dao.warehouse;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.member.Member;
import com.whc.aip.storage.model.voucher.VoucherMember;
import com.whc.aip.storage.model.warehouse.WarehouseCellExample;
import com.whc.aip.storage.model.warehouse.WarehouseCell;
import com.whc.aip.storage.model.warehouse.WarehouseCellCount;
import com.whc.aip.storage.model.warehouse.WarehouseCellInfo;
import com.whc.aip.storage.model.warehouse.Wahoce;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WarehouseCellMapper {
    int countByExample(WarehouseCellExample example);

    int deleteByExample(WarehouseCellExample example);

    int deleteByPrimaryKey(String id);

    int insert(WarehouseCell record);

    int insertSelective(WarehouseCell record);

    List<WarehouseCell> selectByExample(WarehouseCellExample example);

    WarehouseCell selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WarehouseCell record, @Param("example") WarehouseCellExample example);

    int updateByExample(@Param("record") WarehouseCell record, @Param("example") WarehouseCellExample example);

    int updateByPrimaryKeySelective(WarehouseCell record);

    int updateByPrimaryKey(WarehouseCell record);

    List<WarehouseCellCount> getWahouseCellCount(WarehouseCellCount warehouseCellCountParams) throws CommonException;
    List<WarehouseCellInfo> getWarehouseCellInfo(WarehouseCellInfo warehouseCellInfoParams) throws CommonException;
    List<Wahoce> getWahoce(Wahoce wahoceParams) throws CommonException;
    List<VoucherMember> getMemberVoucher(Member memberParams) throws CommonException;
    WarehouseCell getWahoId(String wahoceId) throws CommonException;
}