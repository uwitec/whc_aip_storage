package com.whc.aip.storage.dao.storage;

import com.whc.aip.storage.model.storage.weigateDoor;
import com.whc.aip.storage.model.storage.weigateDoorExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeigateDoorMapper {
    int countByExample(weigateDoorExample example);

    int deleteByExample(weigateDoorExample example);

    int deleteByPrimaryKey(String doorId);

    int insert(weigateDoor record);

    int insertSelective(weigateDoor record);

    List<weigateDoor> selectByExample(weigateDoorExample example);

    weigateDoor selectByPrimaryKey(String doorId);

    int updateByExampleSelective(@Param("record") weigateDoor record, @Param("example") weigateDoorExample example);

    int updateByExample(@Param("record") weigateDoor record, @Param("example") weigateDoorExample example);

    int updateByPrimaryKeySelective(weigateDoor record);

    int updateByPrimaryKey(weigateDoor record);
}