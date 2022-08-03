package com.wenqi.bootwebdemo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.wenqi.bootwebdemo.dao.JFYRepo;
import com.wenqi.bootwebdemo.model.Item;
import com.wenqi.bootwebdemo.model.Response;
import com.wenqi.bootwebdemo.model.Result;
import com.wenqi.bootwebdemo.util.JsonUtility;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


// Deal with the received json
@Service
public class JFYService {
    @Autowired
    JFYRepo jfyRepo;

    public String storeResponse(HttpResponse<JsonNode> response){
        ObjectMapper objectMapper = new ObjectMapper();
        JSONObject responseBody = response.getBody().getObject();
        // map to response class
        try {
            Response response1 = objectMapper.readValue(responseBody.toString(),Response.class);
            List<Result> resultClassList = response1.getResult();
//            for (Result result : resultClassList) {
//                System.out.println("Item name: " + result.getItemTitle());
//            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        JSONArray results = responseBody.getJSONArray("result");
        List<Item> items = extractProperties(results);
        jfyRepo.writeToDbWithTemplate(items);  // Now db stores my Items object
        jfyRepo.writeToJson(items);

        // The json of Item object is also returned to controller
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

    public void createClassFromJson(JSONObject object){
        String packageName = "com.wenqi.bootwebdemo.model";
        String basePath = "src/main/resources";
        String jsonPath = basePath + File.separator + "response.json";
        try (PrintWriter out = new PrintWriter(new FileWriter(jsonPath))) {
            out.write(object.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        File inputJson = new File(jsonPath);
        File outputPojoDirectory = new File(basePath + File.separator + "convertedPojo");
        outputPojoDirectory.mkdirs();
        try {
            JsonUtility.convertJsonToJavaClass(inputJson.toURI().toURL(), outputPojoDirectory, packageName, inputJson.getName().replace(".json", ""));
        } catch (IOException e) {
            System.out.println("Encountered issue while converting to pojo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
