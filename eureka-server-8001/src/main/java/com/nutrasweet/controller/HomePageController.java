package com.nutrasweet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/homepage")
public class HomePageController{

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping(produces="application/json;charset=utf-8")
    public Map<String,String> getInfo(){
        Map<String,String> map = new HashMap<>();
        map.put("applicationName",applicationName);
        map.put("port",port);
        return map;
    }
}
