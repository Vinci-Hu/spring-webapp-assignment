package com.wenqi.bootwebdemo.controller;

import com.wenqi.bootwebdemo.exception.PersonNotFoundException;
import com.wenqi.bootwebdemo.model.Person;
import com.wenqi.bootwebdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(path="/persons", produces= {"application/json"})
    public List<Person> getPersonList(){
        List<Person> personList = personService.getAllPersons();
//        System.out.println("Controller layer: " + personList);
        return personList;
    }

    @GetMapping("/person/{aid}")
    public String getPersonById(@PathVariable("aid") int aid){
        String speech = null;
        try {
            speech = personService.getPersonById(aid);
        } catch (PersonNotFoundException e) {
            return "Oops! No person found";
        }
        return speech;
    }

    @PostMapping(path="/person/add", consumes = {"application/json"})
    public String addPerson(@RequestBody Person person){
        // int aid(>=10), String aname, String lang
        // todo: check existing aids, now assume pass in correct aid
        boolean callServiceSuccess = personService.addPersonService(person);
        // todo: return a json
        if (callServiceSuccess){
            return "Person created..." + person.speak();
        } else{
            return "Person creation failed.";
        }
    }
}
