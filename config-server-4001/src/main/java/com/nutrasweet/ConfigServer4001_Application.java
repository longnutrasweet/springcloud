package com.nutrasweet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer4001_Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer4001_Application.class);
    }
}
