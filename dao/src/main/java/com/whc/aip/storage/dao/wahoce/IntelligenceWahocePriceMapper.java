package com.whc.aip.storage.dao.wahoce;

import com.whc.aip.storage.model.wahoce.ImmediateWahocePrice;
import com.whc.aip.storage.model.wahoce.IntelligenceWahocePrice;
import com.whc.aip.storage.model.wahoce.IntelligenceWahocePriceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IntelligenceWahocePriceMapper {
    int countByExample(IntelligenceWahocePriceExample example);

    int deleteByExample(IntelligenceWahocePriceExample example);

    int insert(IntelligenceWahocePrice record);

    int insertSelective(IntelligenceWahocePrice record);

    List<IntelligenceWahocePrice> selectByExample(IntelligenceWahocePriceExample example);

    int updateByExampleSelective(@Param("record") IntelligenceWahocePrice record, @Param("example") IntelligenceWahocePriceExample example);

    int updateByExample(@Param("record") IntelligenceWahocePrice record, @Param("example") IntelligenceWahocePriceExample example);

    List<IntelligenceWahocePrice> getIntelligenceWahocePrice(IntelligenceWahocePrice intelligenceWahocePrice);
}