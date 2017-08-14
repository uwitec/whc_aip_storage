package com.whc.aip.storage.dao.wahoce;

import com.whc.aip.storage.model.wahoce.ImmediateWahocePrice;
import com.whc.aip.storage.model.wahoce.ImmediateWahocePriceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ImmediateWahocePriceMapper {
    int countByExample(ImmediateWahocePriceExample example);

    int deleteByExample(ImmediateWahocePriceExample example);

    int deleteByPrimaryKey(String id);

    int insert(ImmediateWahocePrice record);

    int insertSelective(ImmediateWahocePrice record);

    List<ImmediateWahocePrice> selectByExample(ImmediateWahocePriceExample example);

    ImmediateWahocePrice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ImmediateWahocePrice record, @Param("example") ImmediateWahocePriceExample example);

    int updateByExample(@Param("record") ImmediateWahocePrice record, @Param("example") ImmediateWahocePriceExample example);

    int updateByPrimaryKeySelective(ImmediateWahocePrice record);

    int updateByPrimaryKey(ImmediateWahocePrice record);

    List<ImmediateWahocePrice> getImmediateWahocePrice(ImmediateWahocePrice immediateWahocePrice);
}