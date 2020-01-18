package com.fly.springcloud.fallback;

import com.fly.springcloud.entity.LicensePlate;
import com.fly.springcloud.service.LicensePlateService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by XianRui on 2020-01-18 13:49
 **/
@Component
public class LicensePlateServiceFallbackFactory implements FallbackFactory<LicensePlateService> {

    @Override
    public LicensePlateService create(Throwable throwable) {
        return new LicensePlateService() {
            @Override
            public LicensePlate get(Long id) {
                return new LicensePlate().setId(id)
                        .setColor(null)
                        .setBriefCase("未找到该ID的结果");
            }

            @Override
            public List<LicensePlate> list() {
                return null;
            }
        };
    }
}
