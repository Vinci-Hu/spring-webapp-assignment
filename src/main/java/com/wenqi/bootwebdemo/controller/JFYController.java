package com.wenqi.bootwebdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// Used to call external API
@RestController
public class JFYController {
    @GetMapping(value="/callclient")
    private String getClient(){
        String uri="https://grecom.taobao.com/recommend";
        // parameters list:
        // &pageSize=36 // configure
        // &language=en-SG
        // &scene=21201 // configure
        // &size=15
        // &user_id=7263421 //configure
        // &config_id=
        // &appid=31576 //configure
        // &channel_id=
        // &region_id=ph
        // &need_cross_module_dedup=true
        // TODO：Make the url complete with 4 inputs and other defaults
        // TODO：Service deal with received json
        // TODO：Return list of objects

        return "";
    }
}
