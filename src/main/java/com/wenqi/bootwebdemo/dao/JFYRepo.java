package com.wenqi.bootwebdemo.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wenqi.bootwebdemo.model.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Repository
public class JFYRepo {
    private static final Logger logger = LogManager.getLogger(JFYRepo.class);
    @Autowired
    JdbcTemplate template;
    private final String filePath = "target/";

    public void writeToDbWithTemplate(List<Item> items) {
        for (Item item : items) {
            String sql = "INSERT INTO ITEM VALUES(?,?,?,?,?,?,?)";
            template.update(sql,
                    item.getItemId(),
                    item.getItemPrice(),
                    item.getItemSoldCnt(),
                    item.getItemTitle(),
                    item.getItemUrl(),
                    item.getShopId(),
                    item.getStockAvailable());
        }
        logger.info("Inserted records via template");
    }

    public void writeToJson(List<Item> items) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filePath + "item_list.json"), items);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}