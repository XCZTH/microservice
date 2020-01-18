package com.fly.springcloud.controller;

import com.fly.springcloud.entity.LicensePlate;
import com.fly.springcloud.service.LicensePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by XianRui on 2020-01-15 16:01
 **/
@RestController
@RequestMapping("/consumer/plate")
public class PlateConsumerController {

    @Autowired
    LicensePlateService plateClientService;

    @GetMapping("/{id}")
    LicensePlate get(@PathVariable Long id) {
        return plateClientService.get(id);
    }


    @GetMapping("/list")
    List<LicensePlate> list() {
        return plateClientService.list();
    }


}
