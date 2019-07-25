package com.nutrasweet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/configclient")
@RefreshScope
public class ConfigClientController {

   // @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @GetMapping
    public Map<String,Object> getInfo() {
        Map<String,Object> map = new HashMap<>();
        map.put("port",port);
        map.put("name",name);
        return map;
    }
}
