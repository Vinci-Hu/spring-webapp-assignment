package com.wenqi.bootwebdemo.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wenqi.bootwebdemo.model.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository
public class JFYRepo {
    @Autowired
    JdbcTemplate template;
    private String filePath="target/";
    private static Logger logger = LogManager.getLogger(JFYRepo.class);
    // JDBC driver name and database URL
    @Value("${JDBC_DRIVER}")
    String JDBC_DRIVER;
    @Value("${DB_URL}")
    String DB_URL;
    //  Database credentials
    @Value("${DB_USER}")
    String USER;
    @Value("${DB_PSW}")
    String PASS;

    public void writeToDb(List<Item> items) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // STEP 2: Open a connection
//            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Connected database successfully...");

            // STEP 3: Execute a query
            stmt = conn.createStatement();
            for (Item item : items) {
                String sql = "INSERT INTO Item " + "VALUES (" + item.toQueryString() + ")";
                stmt.executeUpdate(sql);
            }
            System.out.println("Inserted records into the table...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
    }

    public void writeToDbWithTemplate(List<Item> items){
        for (Item item : items){
            String sql = "INSERT INTO ITEM VALUES(?,?,?,?,?,?,?)";
            template.update(sql,
                    item.getItemId(),
                    item.getPrice(),
                    item.getShopId(),
                    item.getStock(),
                    item.getSold(),
                    item.getTitle(),
                    item.getUrl());
        }
        logger.info("Inserted records via template");
    }
    public void writeToJson(List<Item> items){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(filePath+"item_list.json"), items);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}