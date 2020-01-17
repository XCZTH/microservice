package com.fly.springcloud.plate;

import com.fly.springcloud.myrule.MyRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created by XianRui on 2020-01-12 22:22
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICE-PLATE", configuration = MyRuleConfig.class)
public class PlateConsumer {
    public static void main(String[] args) {
        SpringApplication.run(PlateConsumer.class, args);
    }
}
