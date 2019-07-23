package com.nutrasweet;

import com.nutrasweet.filter.AuthFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableEurekaClient
public class EurekaGateway5003_Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaGateway5003_Application.class);
    }



}
