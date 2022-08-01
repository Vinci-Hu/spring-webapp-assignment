package com.wenqi.bootwebdemo.service;

import com.wenqi.bootwebdemo.dao.PersonRepo;
import com.wenqi.bootwebdemo.model.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;

    private static Logger logger = LogManager.getLogger(PersonService.class);
    public List<Person> getAllPersons(){
        List<Person> personList = personRepo.listAllPersons();
        logger.info("Person list generated.");
//        System.out.println("Service layer: " + personList);
        return personList;
    }
}
