package com.wenqi.bootwebdemo.dao;

import com.wenqi.bootwebdemo.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonRepo {
    private static final Logger logger = LogManager.getLogger(PersonRepo.class);
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> getPersonListWithTemplate(){
        String sql = "SELECT * FROM PERSON";
        return jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper(Person.class)
                );
    }

    public Optional<Person> getPersonByIdWithTemplate(Integer aid){
        Optional<Person> oPerson = Optional.empty();
        String sql = "SELECT * FROM PERSON WHERE aid=?";
        try {
            oPerson = Optional.ofNullable(
                    (Person) jdbcTemplate.queryForObject(
                            sql,
                            new BeanPropertyRowMapper(Person.class),
                            new Object[]{aid}));
        }catch (EmptyResultDataAccessException e){
            logger.warn("Person with aid " + aid + " not in database.");
        }
        return oPerson;
    }

    public boolean createPersonWithTemplate(Person person){
        String sql1 = "SELECT aname FROM PERSON WHERE aid=?";
        String sql2 = "INSERT INTO PERSON VALUES(?,?,?)";
        // Intended to check unique id using following. But h2 does not support this.
        String sql3 = "IF NOT EXISTS (SELECT * FROM PERSON WHERE aid=?)" +
                "   BEGIN" +
                "       INSERT INTO PERSON (aid, aname, lang)" +
                "       VALUES (?,?,?)" +
                "   END";
        int result = 0;
        try {
            jdbcTemplate.queryForObject(
                            sql1,
                            String.class,
                            new Object[]{person.getAid()});
        }catch (EmptyResultDataAccessException e){
            result = jdbcTemplate.update(
                    sql2,
                    person.getAid(),
                    person.getAname(),
                    person.getLang());
        }
        if (result==1){
            return true;
        }else{
            logger.error("Person is not inserted because of duplicate aid!");
            return false;
        }
    }
}
