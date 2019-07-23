package com.nutrasweet.controller;

import com.nutrasweet.feign.FeignConsumer;
import com.nutrasweet.service.IHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/feignconsumer")
public class FeignConsumerController {

    @Autowired
    private FeignConsumer feignConsumer;

    @GetMapping(produces="application/json;charset=utf-8")
    public Map<String,String> getInfo(){
        return feignConsumer.getInfo();
    }
}
