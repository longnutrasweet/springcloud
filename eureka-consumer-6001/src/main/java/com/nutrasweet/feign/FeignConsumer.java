package com.nutrasweet.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * feign接口方式调用
 */
@FeignClient(value="eureka-provider-7001",fallbackFactory=FallBackFactory.class)
@RequestMapping("/provider")
public interface FeignConsumer {

    @GetMapping(produces="application/json;charset=utf-8")
    Map<String,String> getInfo();
}
