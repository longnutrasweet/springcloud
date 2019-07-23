package com.nutrasweet.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AuthFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String token = exchange.getRequest().getQueryParams().getFirst("token");

        ServerHttpResponse response = exchange.getResponse();
        if(token!=null) {
           return chain.filter(exchange);
        }

        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        response.getHeaders().add("Content-type","application/json;charset=UTF-8");

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String,String> map = new HashMap<>();
        map.put("msg","error");
        byte[] bytes = null;
        try {
            bytes = objectMapper.writeValueAsBytes(map);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
        }

        DataBuffer buffer = null;
        buffer = response.bufferFactory().wrap(bytes);
        response.setStatusCode(HttpStatus.OK);
        return response.writeWith(Mono.just(buffer));
    }

    @Override
    public int getOrder() {
        return -1000;
    }
}
