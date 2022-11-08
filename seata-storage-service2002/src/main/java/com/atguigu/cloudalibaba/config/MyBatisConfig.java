package com.atguigu.cloudalibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiang zhongxun
 * @create 2022-11-08 18:28
 */
@Configuration
@MapperScan({"com.atguigu.cloudalibaba.dao"})
public class MyBatisConfig {
}
