package com.nutrasweet;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8003_Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8003_Application.class);
    }
}
