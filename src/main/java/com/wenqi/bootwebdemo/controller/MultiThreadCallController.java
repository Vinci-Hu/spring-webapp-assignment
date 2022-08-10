package com.wenqi.bootwebdemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.wenqi.bootwebdemo.model.MultiResponseDTO;
import com.wenqi.bootwebdemo.model.MultiThreadCallRequestDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.util.stream.Collectors.joining;

@RestController
public class MultiThreadCallController {
    private static final Logger logger = LogManager.getLogger(MultiThreadCallController.class);

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping(value = "/multi")
    public List<MultiResponseDTO> callExternalMultiThread(MultiThreadCallRequestDTO requestDTO) {
        Integer threadCnt = requestDTO.getThread_cnt();
        // Now assert thread = 3

        // Generate url for external get request
        String prefix = "https://grecom.taobao.com/recommend?";
        String suffix = "&language=en-SG&size=15&region_id=ph&need_cross_module_dedup=false";
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("appid", String.valueOf(requestDTO.getAppid()));
        requestParams.put("scene", String.valueOf(requestDTO.getScene()));
        requestParams.put("user_id", String.valueOf(requestDTO.getUser_id()));
        requestParams.put("pageSize", String.valueOf(requestDTO.getPageSize()));

        String encodedUrl = requestParams.keySet().stream().map(key -> {
            try {
                return key + "=" + encodeValue(requestParams.get(key));
            } catch (UnsupportedEncodingException e) {
                logger.error("Multi call api: Url encoding fails.");
                throw new RuntimeException();
            }
        }).collect(joining("&", prefix, suffix));
        logger.info("Multi call api: External HTTP url produced. url: " + encodedUrl);

        // Create an arraylist for response objects
        List<MultiResponseDTO> responseDTOList = new ArrayList<>();

        try {
            responseDTOList = runMultiThread(3, encodedUrl, responseDTOList);
        } catch (ExecutionException e) {
            logger.error("Multi call api: future exceution exception detected.");
        } catch (InterruptedException e) {
            logger.error("Multi call api: future exceution interrupted.");
        }
        return responseDTOList;
    }

    private List<MultiResponseDTO> runMultiThread(Integer threadCnt,
                                                   String encodedUrl,
                                                   List<MultiResponseDTO> responseDTOList) throws ExecutionException, InterruptedException {
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                HttpResponse<JsonNode> response = Unirest.get(encodedUrl).asJson();
                JSONObject responseBody = response.getBody().getObject();
                MultiResponseDTO responseDTO = objectMapper.readValue(responseBody.toString(), MultiResponseDTO.class);
                responseDTOList.add(responseDTO);
                logger.info("Thread " + name + ": tpp_trace = " + responseDTO.getTppTrace());
            } catch (UnirestException e) {
                logger.error("Multi call api: Unirest Get response as json fails.");
            } catch (JsonProcessingException e) {
                logger.error("Multi call api: Json processing of response fails.");
            }
        };

        CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(
                CompletableFuture.runAsync(runnable),
                CompletableFuture.runAsync(runnable),
                CompletableFuture.runAsync(runnable));
        combinedFuture.get();
        return responseDTOList;
    }
    private String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }

}
