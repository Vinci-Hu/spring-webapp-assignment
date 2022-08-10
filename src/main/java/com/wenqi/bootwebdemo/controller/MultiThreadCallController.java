package com.wenqi.bootwebdemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.wenqi.bootwebdemo.model.MultiThreadCallRequestDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;

@RestController
public class MultiThreadCallController {
    private static final Logger logger = LogManager.getLogger(MultiThreadCallController.class);

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping(value = "/multi")
    public String callExternalMultiThread(MultiThreadCallRequestDTO requestDTO) {
        Integer threadCnt = requestDTO.getThread_cnt();

        String prefix = "https://grecom.taobao.com/recommend?";
        String suffix = "&language=en-SG&size=15&region_id=ph&need_cross_module_dedup=false";
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("appid", String.valueOf(requestDTO.getAppid()));
        requestParams.put("scene", String.valueOf(requestDTO.getScene()));
        requestParams.put("user_id", String.valueOf(requestDTO.getUser_id()));
        requestParams.put("pageSize", String.valueOf(requestDTO.getPageSize()));

        String encodedURL = requestParams.keySet().stream().map(key -> {
            try {
                return key + "=" + encodeValue(requestParams.get(key));
            } catch (UnsupportedEncodingException e) {
                logger.error("Multi call api: Url encoding fails.");
                throw new RuntimeException();
            }
        }).collect(joining("&", prefix, suffix));
        logger.info("External HTTP url produced. url: " + encodedURL);

        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                HttpResponse<JsonNode> response = Unirest.get(encodedURL).asJson();
                JSONObject responseBody = response.getBody().getObject();
                String tpp_trace = responseBody.getString("tpp_trace");
                logger.info("Thread " + name + ": tpp_trace = " + tpp_trace);
            } catch (UnirestException e) {
                logger.error("Multi call api: Unirest Get response as json fails.");
            }
        };

//        runnable.run();

        for (int i = 0; i < threadCnt; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }
        return "success";
    }

    private String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }

}
