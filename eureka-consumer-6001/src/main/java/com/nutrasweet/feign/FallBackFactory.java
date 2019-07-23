package com.nutrasweet.feign;

import com.nutrasweet.service.IHystrixService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * feign熔断器服务降级
 */
@Component
public class FallBackFactory implements FallbackFactory<FeignConsumer>  {


    @Override
    public FeignConsumer create(Throwable throwable) {
        return new FeignConsumer() {
            @Override
            public Map<String, String> getInfo() {
                Map<String, String> map=new HashMap<>();
                map.put("error", "error");
                return map;
            }
        };
    }
}
