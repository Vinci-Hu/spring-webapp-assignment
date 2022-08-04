package com.wenqi.bootwebdemo.dao;

import com.wenqi.bootwebdemo.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonRepo {
    private static final Logger logger = LogManager.getLogger(PersonRepo.class);
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

    public List<Person> listAllPersons() {
        List<Person> personList = new ArrayList<Person>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Execute a query
            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "SELECT aid,aname,lang FROM PERSON";
            ResultSet rs = stmt.executeQuery(sql);
            logger.info("Fetched data from db successfully.");

            // STEP 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int aid = rs.getInt("aid");
                String aname = rs.getString("aname");
                String lang = rs.getString("lang");
                // Create Person object
                Person person = new Person(aid, aname, lang);
                personList.add(person);
            }
            // STEP 5: Clean-up environment
            rs.close();
            return personList;
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } //end finally try
        } //end try
        return personList;
    }

    public Optional<Person> getPersonById(int aid) {
        Optional<Person> person = Optional.empty();
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Execute a query
            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "SELECT aid,aname,lang FROM PERSON WHERE aid=" + aid;
            ResultSet rs = stmt.executeQuery(sql);
            logger.info("Fetched data from db successfully.");

            // STEP 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                String aname = rs.getString("aname");
                String lang = rs.getString("lang");
                // Create Person object
                person = Optional.of(new Person(aid, aname, lang));
            }
            // STEP 5: Clean-up environment
            rs.close();
            return person;
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } //end finally try
        } //end try
        return person;
    }

    public boolean addPerson(Person person) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Execute a query
            System.out.println("Connected database successfully...");
            stmt = conn.createStatement();
            String sql = "insert into person values(" + person.getAid() + ",'" + person.getAname() + "','" + person.getLang() + "');";
            stmt.executeUpdate(sql);
            logger.info("Added person successfully");

            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
            return true;
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } //end finally try
        } //end try
        return false;
    }
}
