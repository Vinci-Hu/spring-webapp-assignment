package com.wenqi.bootwebdemo.controller;

import com.wenqi.bootwebdemo.model.Person;
import com.wenqi.bootwebdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(path="/person", produces= {"application/json"})
    public List<Person> getPersonList(){
        List<Person> personList = personService.getAllPersons();
//        System.out.println("Controller layer: " + personList);
        return personList;
    }
}
