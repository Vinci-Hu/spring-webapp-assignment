package com.wenqi.bootwebdemo.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person implements Creature {

    private static Logger logger = LogManager.getLogger(Person.class);
    @Id
    private int aid;
    private String aname;
    private  String lang;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Person() {
        logger.info("A Person is born.");
    }

    @Override
    public void breathe() {
        System.out.println("I am breathing.");
    }
}
