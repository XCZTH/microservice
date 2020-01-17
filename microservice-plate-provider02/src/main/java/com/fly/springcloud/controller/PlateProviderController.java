package com.fly.springcloud.controller;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XianRui on 2020-01-12 20:25
 **/

@RestController
@RequestMapping("/provider/plate")
public class PlateProviderController {

    @GetMapping("/{id}")
    public R get(@PathVariable("id") String id) {
        return R.ok("plate provider02 " + id);
    }

}
