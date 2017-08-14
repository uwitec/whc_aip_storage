package com.whc.aip.storage.dao.warehouse;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.warehouse.Warehouse;
import com.whc.aip.storage.model.warehouse.WarehouseExample;
import com.whc.aip.storage.model.warehouse.WarehouseList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WarehouseMapper {
    int countByExample(WarehouseExample example);

    int deleteByExample(WarehouseExample example);

    int deleteByPrimaryKey(String id);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<Warehouse> selectByExample(WarehouseExample example);

    Warehouse selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);

    List<Warehouse> getWarehouseList(WarehouseList warehouseParams)  throws CommonException;

    List<Warehouse> getWarehouseInfo(Warehouse warehouseParams) throws CommonException;

    Warehouse getWarehouseType(String wahoId) throws CommonException;
}