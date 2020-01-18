package com.fly.springcloud.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * Created by XianRui on 2020-01-16 9:13
 **/
@Data
public class LicensePlate {

    @TableId
    private Long id;

    private String number;

    private String color;

    private String briefCase;

}
