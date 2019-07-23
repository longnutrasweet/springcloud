package com.nutrasweet;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProvider7003_Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider7003_Application.class);
    }
}
