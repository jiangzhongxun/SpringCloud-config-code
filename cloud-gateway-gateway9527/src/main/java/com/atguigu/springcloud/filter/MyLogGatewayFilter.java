package com.atguigu.springcloud.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * 自定义过滤器, 自定义全局 GlobalFilter
 *  1. 需要实现两个主要接口 GlobalFilter  Ordered
 *  2. 能干嘛？
 *     ① 全局日志记录
 *     ② 统一网关鉴权
 *     ③ 。。。。。。。。
 *
 *
 * @author jzx
 * @create 2022-11-02-21:31
 */
@Component
@Slf4j
public class MyLogGatewayFilter implements GlobalFilter, Ordered {

    /**
     * 过滤器
     * @param exchange 交换
     * @param chain    过滤器链
     * @return {@code Mono<Void>}
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("====== come in MyLogGatewayFilter: " + new Date());
        String username = exchange.getRequest().getQueryParams().getFirst("username");
        if (username == null) {
            log.info("====== 用户名为 null，非法用户，叉出去！======");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    /**
     * 设置优先级，数字越小优先级越高
     * @return int
     */
    @Override
    public int getOrder() {
        return 0;
    }

}
