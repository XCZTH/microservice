package com.springcloud.fly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by XianRui on 2020-01-18 17:04
 **/
@SpringBootApplication
@EnableConfigServer
public class MicroserviceConfig {
    // http://localhost:5201/application-dev.yml
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConfig.class, args);
    }

}
