package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jzx
 * @create 2022-11-03-22:55
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${config.info}")            // config.info 是客户端 3355 访问 3344 服务 远程读取 git 上的配置文件的内容
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }

}
