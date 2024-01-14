package com.bachtx.gatewayservice.configurations;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfiguration {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route((route) -> route.path("/manga/**")
                                .filters(gatewayFilterSpec -> gatewayFilterSpec.stripPrefix(1))
                                .uri("hb://manga-service/"))
                .build();
    }
}
