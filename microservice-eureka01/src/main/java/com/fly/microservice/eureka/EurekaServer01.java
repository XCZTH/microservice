package com.fly.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by XianRui on 2020-01-12 18:35
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer01 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer01.class, args);
    }
}
