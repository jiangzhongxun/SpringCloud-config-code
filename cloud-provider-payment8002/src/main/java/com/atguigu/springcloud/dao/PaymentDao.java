package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author jzx
 * @create 2022-10-22-10:56
 */
@Mapper
public interface PaymentDao {

    /**
     * 新增 payment
     *
     * @param payment payment 信息
     * @return int
     */
    int create(Payment payment);

    /**
     * 通过 id 获取 payment
     *
     * @param id id
     * @return {@code Payment}
     */
    Payment getPaymentById(@Param("id") Long id);

}
