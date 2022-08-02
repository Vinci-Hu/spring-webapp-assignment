package com.wenqi.bootwebdemo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.wenqi.bootwebdemo.dao.JFYRepo;
import com.wenqi.bootwebdemo.model.Item;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;


// Deal with the received json
@Service
public class JFYService {
    @Autowired
    JFYRepo jfyRepo;

    public String storeResponse(HttpResponse<JsonNode> response){
        JSONObject responseBody = response.getBody().getObject();
        JSONArray results = responseBody.getJSONArray("result");
//        System.out.println("result"+result);
        List<Item> items = extractProperties(results);
        jfyRepo.writeToFile(results); // not implemented yet
        jfyRepo.writeToDb(items);
        jfyRepo.writeToJson(items);
        ObjectMapper objectMapper = new ObjectMapper();
        String itemJsonStr="";
        try {
            itemJsonStr = objectMapper.writeValueAsString(items);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return itemJsonStr;
    }

    private List<Item> extractProperties(JSONArray results){
        List<Item> itemList = new ArrayList<Item>();
        for (Object result : results) {
            JSONObject obj = (JSONObject) result;
            // Check if type is item, if so cast to Item Object
            if (!obj.getString("type").equals("item")) {
                continue;
            }
            long itemId = obj.getLong("itemId");
            String title = obj.getString("itemTitle");
            double price = Double.parseDouble(obj.getString("itemPrice"));
            int sold = obj.getInt("itemSoldCnt");
            int stock = Integer.parseInt(obj.getString("stockAvailable"));
            String url = obj.getString("itemUrl");
            long shopId = obj.getLong("shopId");

            Item item = new Item(itemId,title,price,sold,stock,url,shopId);
            itemList.add(item);
        }
        return itemList;
    }
}
