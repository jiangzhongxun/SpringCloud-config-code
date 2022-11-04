package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jzx
 * @create 2022-10-31-22:44
 */
@Configuration
public class GatewayConfig {

    /**
     * 配置了一个 ID 为 path_route_atguigu 的路由规则
     * 当访问地址 http://localhost:9527/guonei 时，会自动转发到地址：http://news.baidu.com/guonei
     * @param routeLocatorBuilder
     * @return {@code RouteLocator}
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

    /**
     * 配置了一个 ID 为 path_route_atguigu2 的路由规则
     * 当访问地址 http://localhost:9527/guoji 时，会自动转发到地址：http://news.baidu.com/guoji
     * @param routeLocatorBuilder
     * @return {@code RouteLocator}
     */
    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu2",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }

}
