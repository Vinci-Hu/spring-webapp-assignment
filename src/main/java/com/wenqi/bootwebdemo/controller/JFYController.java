package com.wenqi.bootwebdemo.controller;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.wenqi.bootwebdemo.service.JFYService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

// Used to call external API
@RestController
public class JFYController {
    @Autowired
    JFYService jfyService;
    @GetMapping(value="/jfy")
    private String getClient(@RequestParam int appid,
                             @RequestParam int scene,
                             @RequestParam int user_id,
                             @RequestParam int pageSize) throws Exception{
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
        // Host url
        String prefix = "https://grecom.taobao.com/recommend?";
        String suffix = "&language=en-SG&size=15&region_id=ph&need_cross_module_dedup=false";
//        String charset = "UTF-8";
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("appid", String.valueOf(appid));
        requestParams.put("scene", String.valueOf(scene));
        requestParams.put("user_id", String.valueOf(user_id));
        requestParams.put("pageSize", String.valueOf(pageSize));

        String encodedURL = requestParams.keySet().stream()
                .map(key -> {
                    try {
                        return key + "=" + encodeValue(requestParams.get(key));
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(joining("&", prefix, suffix));
        System.out.println("URL: " + encodedURL);

        HttpResponse <JsonNode> response = Unirest.get(encodedURL)
                .asJson();
//        System.out.println("Status: "+response.getStatus());
//        System.out.println(response.getHeaders().get("Content-Type"));

        String serviceResults = jfyService.storeResponse(response);
//        jfyService.createClassFromJson(response.getBody().getObject());
        return serviceResults;
    }

    private String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }
}
