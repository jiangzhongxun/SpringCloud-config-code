package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jzx
 * @create 2022-10-22-10:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    /**
     * 响应状态代码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 构造器
     * @param code    响应状态代码
     * @param message 响应消息
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
