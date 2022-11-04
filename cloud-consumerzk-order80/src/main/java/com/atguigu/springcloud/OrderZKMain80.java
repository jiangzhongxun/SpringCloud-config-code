package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jzx
 * @create 2022-10-23-22:17
 */
@SpringBootApplication
@EnableDiscoveryClient          // 该注解用于向使用 consul 或者 zookeeper 作为注册中心时注册服务
public class OrderZKMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class, args);
    }

}
