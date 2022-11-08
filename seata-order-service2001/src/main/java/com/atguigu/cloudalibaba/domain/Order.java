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

    /**
     * 主键 id
     */
    private Long id;

    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 产品 ID
     */
    private Long productId;

    /**
     * 订单数量
     */
    private Integer count;

    /**
     * 订单金额
     */
    private BigDecimal money ;

    /**
     * 订单状态： 0 ：创建中； 1 ：已完结
     */
    private Integer status;

}
