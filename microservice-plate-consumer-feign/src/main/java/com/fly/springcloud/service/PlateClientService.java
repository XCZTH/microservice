package com.fly.springcloud.service;

import com.fly.springcloud.entity.LicensePlate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by XianRui on 2020-01-15 16:35
 **/
@FeignClient(value = "MICROSERVICE-PLATE")
public interface PlateClientService {

    @GetMapping("/provider/plate/{id}")
    LicensePlate get(@PathVariable(value = "id") Long id);


    @GetMapping("/provider/plate/list")
    List<LicensePlate> list();


}
