package com.wenqi.bootwebdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Creature {

    private static final Logger logger = LogManager.getLogger(Person.class);
    @Id
    private int aid;
    private String aname;
    private String lang;

    @Override
    public String toString() {
        return "Person " + aid + " named " + aname + " speaks " + lang + ".";
    }

    @Override
    public void breathe() {
        System.out.println("I am breathing.");
    }

    public String speak() {
        switch (lang) {
            case "Chinese":
                return "Ni hao! Wo shi " + aname + ".";
//                break;
            case "English":
                return "Hello! I am " + aname + ".";
//                break;
            case "Italian":
                return "Ciao! sono " + aname + ".";
//                break;
            case "Spanish":
                return "¡hola! soy " + aname + ".";
//                break;
            case "Japanese":
                return "Konichiwa! Watashiwa " + aname + " desu.";
//                break;
            default:
                return "Hi!";
        }
    }
}
