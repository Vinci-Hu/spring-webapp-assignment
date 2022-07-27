package com.wenqi.bootwebdemo;

import org.springframework.stereotype.Component;

@Component
public class Person implements Creature{

    @Override
    public void breathe() {
        System.out.println("I am breathing.");
    }
}
