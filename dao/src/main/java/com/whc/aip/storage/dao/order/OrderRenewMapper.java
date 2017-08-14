package com.whc.aip.storage.dao.order;

import com.whc.aip.storage.model.order.OrderRenew;
import com.whc.aip.storage.model.order.OrderRenewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderRenewMapper {
    int countByExample(OrderRenewExample example);

    int deleteByExample(OrderRenewExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderRenew record);

    int insertSelective(OrderRenew record);

    List<OrderRenew> selectByExample(OrderRenewExample example);

    OrderRenew selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderRenew record, @Param("example") OrderRenewExample example);

    int updateByExample(@Param("record") OrderRenew record, @Param("example") OrderRenewExample example);

    int updateByPrimaryKeySelective(OrderRenew record);

    int updateByPrimaryKey(OrderRenew record);
}