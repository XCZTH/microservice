package com.fly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by XianRui on 2020-01-15 16:00
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class PlateConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(PlateConsumerFeign.class, args);
    }

}
