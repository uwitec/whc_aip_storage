package com.whc.aip.storage.dao.cabinet;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.cabinet.CabinetRecord;
import com.whc.aip.storage.model.cabinet.CabinetRecordExample;
import com.whc.aip.storage.model.cabinet.CabinetRecordNumberLock;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CabinetRecordMapper {
    int countByExample(CabinetRecordExample example);

    int deleteByExample(CabinetRecordExample example);

    int deleteByPrimaryKey(String id);

    int insert(CabinetRecord record);

    int insertSelective(CabinetRecord record);

    List<CabinetRecord> selectByExample(CabinetRecordExample example);

    CabinetRecord selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CabinetRecord record, @Param("example") CabinetRecordExample example);

    int updateByExample(@Param("record") CabinetRecord record, @Param("example") CabinetRecordExample example);

    int updateByPrimaryKeySelective(CabinetRecord record);

    int updateByPrimaryKey(CabinetRecord record);

    CabinetRecordNumberLock getCabinetRecordNumberLock(String orderId) throws CommonException;

    List<CabinetRecord> getWeigateCabinetRecordList(String orderId) throws CommonException;
}