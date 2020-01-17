package com.fly.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by XianRui on 2020-01-12 19:49
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer02.class, args);
    }
}
