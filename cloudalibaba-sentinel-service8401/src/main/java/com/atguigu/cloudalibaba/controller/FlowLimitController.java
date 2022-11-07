package com.atguigu.cloudalibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.TimeUnit;

/**
 * @author jiang zhongxun
 * @create 2022-11-06 22:28
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping( "/testA" )
    public String testA() {
        return "------testA" ;
    }

    @GetMapping ( "/testB" )
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "------testB" ;
    }

    @GetMapping ( "/testD" )
    public String testD() {
        //try {
        //    TimeUnit.SECONDS.sleep(1);
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}
        //log.info("testD 测试 RT");
        log.info("testD 测试 异常比例");
        int age = 10 / 0;
        return "------testD" ;
    }

    @GetMapping ( "/testE" )
    public String testE() {
        log.info("testD 测试 异常数");
        int age = 10 / 0;
        return "------testE" ;
    }

    @GetMapping("/testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "------testHotKey" ;
    }

}
