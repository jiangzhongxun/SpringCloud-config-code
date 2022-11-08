package com.atguigu.cloudalibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 20:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    /**
     * 主键 ID
     */
    private Long id;

    /**
     * 产品 ID
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

}
