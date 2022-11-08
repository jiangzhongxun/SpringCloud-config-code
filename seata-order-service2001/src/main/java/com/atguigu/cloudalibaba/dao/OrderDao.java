package com.atguigu.cloudalibaba.dao;

import com.atguigu.cloudalibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 18:26
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
