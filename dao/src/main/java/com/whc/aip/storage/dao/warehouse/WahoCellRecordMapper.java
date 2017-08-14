package com.whc.aip.storage.dao.warehouse;

import com.whc.aip.storage.model.warehouse.WahoCellRecord;

public interface WahoCellRecordMapper {
    int insert(WahoCellRecord record);

    int insertSelective(WahoCellRecord record);

    WahoCellRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WahoCellRecord record);

    int updateByPrimaryKey(WahoCellRecord record);
}