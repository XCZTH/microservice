package com.fly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by XianRui on 2020-01-18 15:44
 **/

@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway.class,args);
    }

}
