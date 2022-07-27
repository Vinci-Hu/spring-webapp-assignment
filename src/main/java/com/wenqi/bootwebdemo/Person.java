package com.wenqi.bootwebdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Person implements Creature{

    private static Logger logger = LogManager.getLogger(Person.class);

    public Person() {
        logger.info("A Person is born.");
    }

    @Override
    public void breathe() {
        System.out.println("I am breathing.");
    }
}
