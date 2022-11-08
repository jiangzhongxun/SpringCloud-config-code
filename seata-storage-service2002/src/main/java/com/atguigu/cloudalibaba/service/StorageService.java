package com.atguigu.cloudalibaba.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 21:16
 */
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);

}
