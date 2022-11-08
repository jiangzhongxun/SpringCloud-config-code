package com.atguigu.cloudalibaba.service.impl;

import com.atguigu.cloudalibaba.dao.OrderDao;
import com.atguigu.cloudalibaba.domain.Order;
import com.atguigu.cloudalibaba.service.AccountService;
import com.atguigu.cloudalibaba.service.OrderService;
import com.atguigu.cloudalibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 19:00
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    /**
     * 创建订单 -> 调用库存服务扣减库存 -> 调用账户服务扣减账户余额 -> 修改订单状态
     * 简单说：下订单 -> 减库存 -> 减余额 -> 改状态
     */
    @Override
    public void create(Order order) {
        // 本应用创建订单
        log.info("====== 开始新建订单 ======");
        orderDao.create(order);

        // 远程调用库存服务扣减库存
        log.info("====== 订单微服务开始调用库存，扣减库存开始 ======");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("====== 订单微服务开始调用库存，扣减库存结束 ======");

        // 远程调用账户服务扣减余额
        log.info("====== 订单微服务开始调用余额，扣减余额开始 ======");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("====== 订单微服务开始调用余额，扣减余额结束 ======");

        // 修改订单状态为已完成
        log.info("====== 订单微服务开始调用余额，修改订单状态开始 ======");
        //orderDao.update(order.getUserId(), order.getStatus());
        orderDao.update(order.getUserId(), 0);
        log.info("====== 订单微服务开始调用余额，修改订单状态结束 ======");

        log.info("====== 下单结束 ======");
    }

}
