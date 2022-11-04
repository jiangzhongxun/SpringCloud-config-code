package com.atguigu.springcloud;

import com.atguigu.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author jzx
 * @create 2022-10-22-13:46
 */
@SpringBootApplication
@EnableEurekaClient         // 开启 eureka client
//@RibbonClient(name = "CLOUD-PAYMENT-SERVER", configuration = MyselfRule.class)      // 启用 Ribbon
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
