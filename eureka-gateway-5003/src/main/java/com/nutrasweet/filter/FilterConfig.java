package com.nutrasweet.filter;

import org.springframework.cloud.gateway.filter.ForwardPathFilter;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class FilterConfig {

   /* @Bean
    public RouteLocator customRouteFilter(RouteLocatorBuilder builder) {
        return builder.routes().route(r->
                r.path("/gateway/**")
                        .filters(f->f.filter(new AuthFilter()))
                        .uri("lb://eureka-provider-7001").order(0).id("customerFilter")
        ).build();
    }*/
}
