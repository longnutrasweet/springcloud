package com.nutrasweet.service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.nutrasweet.feign.FeignConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class HystrixService implements IHystrixService {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FeignConsumer feignConsumer;

    private static final String requestUrl = "http://eureka-provider-7001/provider";

    @Override
    @HystrixCommand(fallbackMethod="errorMethod")
    public Map<String,String> getInfo() {
        Map<String,String> map = null;
        //产生熔断
        int i = 1/0;
        map = restTemplate.getForEntity(requestUrl,Map.class).getBody();

        return map;
    }

    public Map<String,String> errorMethod() {
        Map<String,String> map = new HashMap<>();
        map.put("msg","error");
        return map;
    }
}
