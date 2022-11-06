package com.atguigu.cloudalibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiang zhongxun
 * @create 2022-11-06 22:28
 */
@RestController
public class FlowLimitController {

    @GetMapping( "/testA" )
    public String testA() {
        return "------testA" ;
    }

    @GetMapping ( "/testB" )
    public String testB() {
        return "------testB" ;
    }

}
