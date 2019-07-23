package com.nutrasweet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import sun.misc.Unsafe;

@SpringBootApplication
@EnableEurekaServer
public class EurekaConfig5004_Appliation {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfig5004_Appliation.class);
    }
}
