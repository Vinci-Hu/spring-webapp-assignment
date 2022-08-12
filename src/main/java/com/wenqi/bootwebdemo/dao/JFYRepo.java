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
    private static final String FILE_PATH = "target/";
    @Autowired
    JdbcTemplate template;
    @Autowired
    ObjectMapper jsonObjMapper;

    public void writeToDbWithTemplate(List<Item> items) {
        for (Item item : items) {
            String sql = "INSERT INTO ITEM VALUES(?,?,?,?,?,?,?)";
            template.update(sql, item.getItemId(), item.getItemPrice(), item.getItemSoldCnt(), item.getItemTitle(), item.getItemUrl(), item.getShopId(), item.getStockAvailable());
        }
        logger.info("Inserted records via template");
    }

    public void writeToJson(List<Item> items) {
        try {
            jsonObjMapper.writeValue(new File(FILE_PATH + "item_list.json"), items);
        } catch (IOException e) {
            logger.warn("JFY response write to JSON failed.");
            throw new RuntimeException(e);
        }
    }
}