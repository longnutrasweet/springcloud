package com.nutrasweet.controller;

import com.nutrasweet.service.IHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/consumer")
public class LoadBalanceConsumerController {

    //服务发现
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private IHystrixService hystrixService;

    @GetMapping(produces="application/json;charset=utf-8")
    public Map<String,String> getInfo(){
        return hystrixService.getInfo();
    }

    @GetMapping(value="discoveryclient",produces="application/json;charset=utf-8")
    public DiscoveryClient getDiscoveryClient() {
        return discoveryClient;
    }


}
