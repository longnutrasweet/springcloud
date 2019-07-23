package com.nutrasweet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8002_application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8002_application.class);
    }
}
