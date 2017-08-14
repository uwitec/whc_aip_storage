package com.whc.aip.storage.dao.cabinet;

import com.whc.aip.storage.model.cabinet.Cabi;
import com.whc.aip.storage.model.cabinet.CabiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CabiMapper {
    int countByExample(CabiExample example);

    int deleteByExample(CabiExample example);

    int deleteByPrimaryKey(String id);

    int insert(Cabi record);

    int insertSelective(Cabi record);

    List<Cabi> selectByExample(CabiExample example);

    Cabi selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Cabi record, @Param("example") CabiExample example);

    int updateByExample(@Param("record") Cabi record, @Param("example") CabiExample example);

    int updateByPrimaryKeySelective(Cabi record);

    int updateByPrimaryKey(Cabi record);
}