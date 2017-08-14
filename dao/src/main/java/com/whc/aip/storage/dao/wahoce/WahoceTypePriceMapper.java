package com.whc.aip.storage.dao.wahoce;

import com.whc.aip.storage.model.wahoce.WahoceTypePrice;
import com.whc.aip.storage.model.wahoce.WahoceTypePriceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WahoceTypePriceMapper {
    int countByExample(WahoceTypePriceExample example);

    int deleteByExample(WahoceTypePriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(WahoceTypePrice record);

    int insertSelective(WahoceTypePrice record);

    List<WahoceTypePrice> selectByExample(WahoceTypePriceExample example);

    WahoceTypePrice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WahoceTypePrice record, @Param("example") WahoceTypePriceExample example);

    int updateByExample(@Param("record") WahoceTypePrice record, @Param("example") WahoceTypePriceExample example);

    int updateByPrimaryKeySelective(WahoceTypePrice record);

    int updateByPrimaryKey(WahoceTypePrice record);

    WahoceTypePrice getWahoceTypePrice(WahoceTypePrice wahoceTypePriceParams);
}