package com.whc.aip.storage.service.order;

import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.storage.model.order.Order;

/**
 * Created by Administrator on 2017/6/2.
 */
public interface OrderService {
    Order getOrder(String orderId) throws CommonException;
}
