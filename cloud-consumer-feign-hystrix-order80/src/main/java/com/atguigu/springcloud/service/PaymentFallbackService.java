package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author jzx
 * @create 2022-10-30-15:03
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "====== PaymentFallbackService fallback --- paymentInfo_OK (*^▽^*) ======";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "====== PaymentFallbackService fallback --- paymentInfo_TimeOut o(╥﹏╥)o ======";
    }

}
