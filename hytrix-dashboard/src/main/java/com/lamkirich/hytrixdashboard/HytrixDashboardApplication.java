package com.lamkirich.hytrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class HytrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HytrixDashboardApplication.class, args);
    }

}
