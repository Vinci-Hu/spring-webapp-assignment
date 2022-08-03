package com.wenqi.bootwebdemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wenqi.bootwebdemo.model.*;
import com.wenqi.bootwebdemo.service.DummyService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DummyController {
    @Autowired
    DummyService dummyService;

    @PostMapping(value="/dummy")
    public String createDummy(@RequestBody DummyData dummyData){

//        JSONObject inputJson = new JSONObject(inputJsonStr);
        // Create new RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        // Setup request header - content type
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        // external api url to call
        String resourceUrl = "https://dummy.restapiexample.com/api/v1/create";

        HttpEntity<DummyData> request = new HttpEntity<>(dummyData,headers);
        ResponseEntity<String> response = restTemplate
                .postForEntity(resourceUrl, request, String.class);
        return response.getBody();
    }
}
