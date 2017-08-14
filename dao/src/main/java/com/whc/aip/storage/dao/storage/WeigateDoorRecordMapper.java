package com.whc.aip.storage.dao.storage;

import com.whc.aip.storage.model.storage.WeigateDoorRecord;
import com.whc.aip.storage.model.storage.WeigateDoorRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeigateDoorRecordMapper {
    int countByExample(WeigateDoorRecordExample example);

    int deleteByExample(WeigateDoorRecordExample example);

    int deleteByPrimaryKey(String doreId);

    int insert(WeigateDoorRecord record);

    int insertSelective(WeigateDoorRecord record);

    List<WeigateDoorRecord> selectByExample(WeigateDoorRecordExample example);

    WeigateDoorRecord selectByPrimaryKey(String doreId);

    int updateByExampleSelective(@Param("record") WeigateDoorRecord record, @Param("example") WeigateDoorRecordExample example);

    int updateByExample(@Param("record") WeigateDoorRecord record, @Param("example") WeigateDoorRecordExample example);

    int updateByPrimaryKeySelective(WeigateDoorRecord record);

    int updateByPrimaryKey(WeigateDoorRecord record);
}