package com.wenqi.bootwebdemo.dao;

import com.wenqi.bootwebdemo.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepo {
    private static Logger logger = LogManager.getLogger(PersonRepo.class);
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

    // sample code for creating table
    public void connectDB(){
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 3: Execute a query
            System.out.println("Creating table in given database...");
            stmt = conn.createStatement();
            String sql =  "CREATE TABLE   REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
    }
    public List<Person> listAllPersons(){
        List<Person> personList = new ArrayList<Person>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 3: Execute a query
            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "SELECT aid,aname,lang FROM PERSON";
            ResultSet rs = stmt.executeQuery(sql);
            logger.info("Fetched data from db successfully.");

            // STEP 4: Extract data from result set
            while(rs.next()) {
                // Retrieve by column name
                int aid  = rs.getInt("aid");
                String aname = rs.getString("aname");
                String lang = rs.getString("lang");
                // Create Person object
                Person person = new Person(aid,aname,lang);
                personList.add(person);
//                System.out.println(person.toString());
            }
//            System.out.println(personList);
            // STEP 5: Clean-up environment
            rs.close();
            return personList;
        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try{
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } //end finally try
        } //end try
        return personList;
    }
}
