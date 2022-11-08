package com.atguigu.cloudalibaba.controller;

import com.atguigu.cloudalibaba.domain.CommonResult;
import com.atguigu.cloudalibaba.domain.Order;
import com.atguigu.cloudalibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 18:28
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult<Order> create(Order order) {
        orderService.create(order);
        return new CommonResult<>(200, "订单创建成功!");
    }

}
