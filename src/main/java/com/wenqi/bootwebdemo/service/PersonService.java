package com.wenqi.bootwebdemo.service;

import com.wenqi.bootwebdemo.dao.PersonRepo;
import com.wenqi.bootwebdemo.exception.PersonNotFoundException;
import com.wenqi.bootwebdemo.model.Person;
import com.wenqi.bootwebdemo.model.PersonResponseDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private static final Logger logger = LogManager.getLogger(PersonService.class);
    @Autowired
    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> getAllPersons() {
        List<Person> personList = personRepo.getPersonListWithTemplate();
        logger.info("Person list generated.");
        return personList;
    }

    public String getPersonById(Integer aid) throws PersonNotFoundException {
        String speech = "";
        if (aid.equals(null)){
            logger.warn("Person id passed in is not valid.");
            throw new PersonNotFoundException();
        }
        Optional<Person> oPerson = personRepo.getPersonByIdWithTemplate(aid);
        if (!oPerson.isPresent()) {
            logger.warn("Cannot find person by id provided.");
            throw new PersonNotFoundException();
        }
        logger.info("Person " + aid + " is retrieved.");
        speech = oPerson.get().speak();
//        Person person = personRepo.getPersonByIdWithTemplate(aid);
//        speech = person.speak();
        return speech;
    }

    public PersonResponseDTO addPersonService(Person person) {
        boolean callRepoSuccess = personRepo.createPersonWithTemplate(person);
        if (callRepoSuccess) {
            return new PersonResponseDTO("success", person, person.speak());
        } else {
            logger.warn("Person not added in database!");
            return new PersonResponseDTO("failed", person, "?");
        }
    }
}
