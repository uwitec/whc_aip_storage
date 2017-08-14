package com.whc.aip.storage.dao.cabinet;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.cabinet.Cabinet;
import com.whc.aip.storage.model.cabinet.CabinetExample;
import com.whc.aip.storage.model.cabinet.CabinetRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CabinetMapper {
    int countByExample(CabinetExample example);

    int deleteByExample(CabinetExample example);

    int insert(Cabinet record);

    int insertSelective(Cabinet record);

    List<Cabinet> selectByExample(CabinetExample example);

    int updateByExampleSelective(@Param("record") Cabinet record, @Param("example") CabinetExample example);

    int updateByExample(@Param("record") Cabinet record, @Param("example") CabinetExample example);

    Cabinet getCabinet(String id) throws CommonException;

}