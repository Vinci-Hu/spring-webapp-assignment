package com.wenqi.bootwebdemo.controller;

import com.wenqi.bootwebdemo.exception.PersonNotFoundException;
import com.wenqi.bootwebdemo.model.Person;
import com.wenqi.bootwebdemo.model.PersonResponseDTO;
import com.wenqi.bootwebdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(path = "/persons", produces = {"application/json"})
    public List<Person> getPersonList() {
        List<Person> personList = personService.getAllPersons();
        return personList;
    }

    @GetMapping("/person/{aid}")
    public String getPersonById(@PathVariable("aid") Integer aid) {
        String speech = null;
        try {
            speech = personService.getPersonById(aid);
        } catch (PersonNotFoundException e) {
            return "Oops! No person found";
        }
        return speech;
    }

    @PostMapping(value = "/person/add", consumes = {"application/json"})
    public PersonResponseDTO addPerson(@RequestBody Person person) {
        // int aid(>=10), String aname, String lang
        // todo: check existing aids, now assume pass in correct aid
        PersonResponseDTO response = personService.addPersonService(person);
        return response;
    }
}
