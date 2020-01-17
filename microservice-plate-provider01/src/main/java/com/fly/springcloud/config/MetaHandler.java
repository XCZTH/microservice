package com.fly.springcloud.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by XianRui on 2020-01-17 16:38
 **/
@Component
public class MetaHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("createBy", "张三", metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("updateBy", "李四", metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
        this.setFieldValByName("updateBy", "李四", metaObject);
    }
}
