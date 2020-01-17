package com.fly.springcloud.plate.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by XianRui on 2020-01-12 22:28
 **/
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

/*    @Bean
    public IRule myRule() {
        return new RandomRule();
    }*/

}
