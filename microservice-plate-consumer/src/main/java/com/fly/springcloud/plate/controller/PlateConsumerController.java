package com.fly.springcloud.plate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by XianRui on 2020-01-12 22:25
 **/

@RestController
@RequestMapping("/consumer/plate")
public class PlateConsumerController {

    public static final String PLATE_PROVIDER_URL_PREFIX = "http://MICROSERVICE-PLATE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Object getObject(@PathVariable Long id) {
        return restTemplate.getForObject(PLATE_PROVIDER_URL_PREFIX + "/provider/plate/" + id, Object.class);
    }
}
