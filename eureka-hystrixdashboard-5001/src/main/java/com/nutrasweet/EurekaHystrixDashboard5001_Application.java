package com.nutrasweet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard //hystrix访问地址http://localhost:5001/hystrix/
public class EurekaHystrixDashboard5001_Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixDashboard5001_Application.class);
    }
}
