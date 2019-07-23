package com.nutrasweet.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadBalanceConfig {

    @Bean
    @LoadBalanced //开启ribbon客户端负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    //选择负载均衡策略规则
    @Bean
    public IRule rule() {
        return new RoundRobinRule();
    }
}
