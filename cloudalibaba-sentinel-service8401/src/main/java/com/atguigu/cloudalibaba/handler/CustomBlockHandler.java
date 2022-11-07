package com.atguigu.cloudalibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * 用于自定义限流处理逻辑 CustomBlockHandler
 *
 * @author jiang zhongxun
 * @create 2022-11-07 16:46
 */
public class CustomBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(5555, "按客户自定义限流处理, global handleException ------ 1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(5555, "按客户自定义限流处理, global handleException ------ 2");
    }

}
