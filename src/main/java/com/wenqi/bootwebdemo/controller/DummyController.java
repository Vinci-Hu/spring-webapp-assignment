package com.wenqi.bootwebdemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wenqi.bootwebdemo.model.DummyDTO;
import com.wenqi.bootwebdemo.model.DummyResponse;
import com.wenqi.bootwebdemo.model.Response;
import com.wenqi.bootwebdemo.model.Result;
import com.wenqi.bootwebdemo.service.DummyService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DummyController {
    @Autowired
    DummyService dummyService;

    @PostMapping(value="/dummy")
    private String createDummy(){
//        WebClient client = WebClient.create("https://dummy.restapiexample.com/api/v1");
//        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.post();
//        WebClient.RequestBodySpec bodySpec = uriSpec.uri(URI.create("/create"));

        // {"name":"greatCarrot","salary":"1234","age":"22"}
        String inputJsonStr = "{\"name\":\"greatCarrot\",\"salary\":\"1234\",\"age\":\"22\"}";
//        JSONObject inputJson = new JSONObject(inputJsonStr);
        // Create new RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        // Setup request header - content type
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        // external api url to call
        String resourceUrl = "https://dummy.restapiexample.com/api/v1/create";

        HttpEntity<String> request = new HttpEntity<String>(inputJsonStr,headers);
        ResponseEntity<String> response = restTemplate
                .postForEntity(resourceUrl, HttpMethod.POST, String.class);
        return response.getBody();
//        JSONObject responseJson = new JSONObject(response.getBody());
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            DummyResponse dResponse = objectMapper.readValue(responseJson.toString(),DummyResponse.class);
//            return dResponse.toString();
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }

//        DummyResponse dummyResponse = response.getBody();


//        WebClient.RequestHeadersSpec<?> headersSpec = bodySpec.bodyValue(inputJsonStr);
//        WebClient.ResponseSpec responseSpec = headersSpec.header(
//                        HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//                .accept(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)
//                .acceptCharset(StandardCharsets.UTF_8)
//                .ifNoneMatch("*")
//                .ifModifiedSince(ZonedDateTime.now())
//                .retrieve();
//        Mono<String> responseMono = headersSpec.exchangeToMono(response -> {
//            if (response.statusCode().equals(HttpStatus.OK)) {
//                return response.bodyToMono(String.class);
//            } else if (response.statusCode().is4xxClientError()) {
//                return Mono.just("Error response");
//            } else {
//                return response.createException()
//                        .flatMap(Mono::error);
//            }
//        });
//        return "Dummy post api called. Response: ";
    }
}
