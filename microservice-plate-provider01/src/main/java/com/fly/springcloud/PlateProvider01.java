package com.fly.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by XianRui on 2020-01-12 20:20
 **/
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.fly.springcloud.mapper")
public class PlateProvider01 {
    public static void main(String[] args) {
        SpringApplication.run(PlateProvider01.class, args);
    }
}
