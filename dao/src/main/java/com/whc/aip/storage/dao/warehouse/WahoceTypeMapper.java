package com.whc.aip.storage.dao.warehouse;

import com.whc.aip.storage.model.wahoce.WahocePriceParam;
import com.whc.aip.storage.model.warehouse.WahoceType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WahoceTypeMapper {
    int insert(WahoceType record);

    int insertSelective(WahoceType record);

    WahoceType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WahoceType record);

    int updateByPrimaryKey(WahoceType record);

    List<WahocePriceParam> selWahocePriceParam(@Param("warehouseId") String warehouseId);

    List<WahoceType> selWahoceTypeByStatus(@Param("status") String status);
}