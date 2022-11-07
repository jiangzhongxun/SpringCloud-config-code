package com.atguigu.cloudalibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author jiang zhongxun
 * @create 2022-11-07 22:15
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(555555,
                "服务降级返回，===PaymentFallbackService===",
                new Payment(id, "errorSerial"));
    }

}
