package com.wenqi.bootwebdemo.controller;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.wenqi.bootwebdemo.service.JFYService;
import com.wenqi.bootwebdemo.service.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private static final Logger logger = LogManager.getLogger(JFYController.class);

    @GetMapping(value = "/jfy")
    public String getClient(@RequestParam int appid, @RequestParam int scene, @RequestParam int user_id, @RequestParam int pageSize) throws Exception {
        String prefix = "https://grecom.taobao.com/recommend?";
        String suffix = "&language=en-SG&size=15&region_id=ph&need_cross_module_dedup=false";
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("appid", String.valueOf(appid));
        requestParams.put("scene", String.valueOf(scene));
        requestParams.put("user_id", String.valueOf(user_id));
        requestParams.put("pageSize", String.valueOf(pageSize));

        String encodedURL = requestParams.keySet().stream().map(key -> {
            try {
                return key + "=" + encodeValue(requestParams.get(key));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }).collect(joining("&", prefix, suffix));
//        System.out.println("URL: " + encodedURL);
        logger.info("External HTTP url called. url: " + encodedURL);
        HttpResponse<JsonNode> response = Unirest.get(encodedURL).asJson();

        String serviceResults = jfyService.storeResponse(response);
        return serviceResults;
    }

    private String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }
}
