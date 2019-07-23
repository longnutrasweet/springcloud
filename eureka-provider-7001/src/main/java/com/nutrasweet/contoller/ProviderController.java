package com.nutrasweet.contoller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @LoadBalanced
    private RestTemplate restTemplate;

    @GetMapping(produces="application/json;charset=utf-8")
    public Map<String,String> getInfo(){
        int i=1/0;
        Map<String,String> map = new HashMap<>();
        map.put("applicationName",applicationName);
        map.put("port",port);
        return map;
    }
}
