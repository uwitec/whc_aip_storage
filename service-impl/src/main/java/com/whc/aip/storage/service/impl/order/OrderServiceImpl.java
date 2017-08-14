package com.whc.aip.storage.service.impl.order;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.dao.order.OrderMapper;
import com.whc.aip.storage.model.order.Order;
import com.whc.aip.storage.service.order.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/2.
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderMapper orderMapper;
    @Override
    public Order getOrder(String orderId) throws CommonException {
        return orderMapper.selectByPrimaryKey(orderId);
    }
}
