package com.atguigu.cloudalibaba.service;

import com.atguigu.cloudalibaba.domain.Order;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 18:27
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);

}
