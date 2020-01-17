package com.fly.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by XianRui on 2020-01-14 21:16
 **/
@Configuration
public class MyRuleConfig {

    @Bean
    public IRule myRule() {
        return new CustomRule();
    }

}
