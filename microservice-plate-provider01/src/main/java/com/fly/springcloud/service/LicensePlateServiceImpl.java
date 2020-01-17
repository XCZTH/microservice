package com.fly.springcloud.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fly.springcloud.entity.LicensePlate;
import com.fly.springcloud.mapper.LicensePlateMapper;
import org.springframework.stereotype.Service;

/**
 * Created by XianRui on 2020-01-17 20:09
 **/
@Service
public class LicensePlateServiceImpl extends ServiceImpl<LicensePlateMapper, LicensePlate> implements ILicensePlateService {

}
