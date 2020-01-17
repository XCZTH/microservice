package com.fly.springcloud.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.fly.springcloud.entity.LicensePlate;
import com.fly.springcloud.service.ILicensePlateService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by XianRui on 2020-01-12 20:25
 **/

@RestController
@RequestMapping("/provider/plate")
@Slf4j
public class PlateProviderController {

    @Autowired
    private ILicensePlateService iLicensePlateService;

    @Resource
    private EurekaClient client;


    @GetMapping("/{id}")
    public LicensePlate get(@PathVariable("id") Long id) {
        LicensePlate plate = iLicensePlateService.getById(id);
        return plate;
    }

    @GetMapping("/list")
    public List<LicensePlate> list() {
        List<LicensePlate> list = iLicensePlateService.list();
        return list;
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<Application> applications = client.getApplications().getRegisteredApplications();
        if (applications != null) {
            for (Application application : applications) {
                String name = application.getName();
                if ("MICROSERVICE-PLATE".equals(name)) {
                    List<InstanceInfo> instances = application.getInstances();
                    log.info("所有的订单服务：{}", instances);
                    if (instances != null) {
                        for (InstanceInfo info : instances) {
                            log.info("服务id：{}", info.getInstanceId());
                            log.info("服务主机：{}", info.getHostName());
                            log.info("服务端口：{}", info.getPort());
                        }
                    }
                    return instances;
                }
            }
        }
        return null;
    }
}
