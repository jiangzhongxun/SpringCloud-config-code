package com.atguigu.cloudalibaba.controller;

import com.atguigu.cloudalibaba.domain.CommonResult;
import com.atguigu.cloudalibaba.domain.Storage;
import com.atguigu.cloudalibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 21:23
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/storage/decrease")
    public CommonResult<Storage> decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult<>(200, "扣减库存成功！");
    }

}
