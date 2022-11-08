package com.atguigu.cloudalibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 18:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money ;

    /**
     * 订单状态： 0 ：创建中； 1 ：已完结
     */
    private Integer status;

}
