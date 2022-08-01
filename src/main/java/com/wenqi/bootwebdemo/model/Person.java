package com.wenqi.bootwebdemo.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Component
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

    public Person(int aid, String aname, String lang) {
        this.aid = aid;
        this.aname = aname;
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Person " + aid +
                " named " + aname +
                " speaks " + lang +
                ".";
    }

    @Override
    public void breathe() {
        System.out.println("I am breathing.");
    }

    public String speak(){
        switch(lang) {
            case "Chinese":
                return "Ni hao! Wo shi "+aname+".";
//                break;
            case "English":
                return "Hello! I am "+aname+".";
//                break;
            case "Italian":
                return "Ciao! sono "+aname+".";
//                break;
            case "Spanish":
                return "¡hola! soy "+aname+".";
//                break;
            case "Japanese":
                return "Konichiwa! Watashiwa "+aname+" desu.";
//                break;
            default:
                return "Hi!";
        }
    }
}
