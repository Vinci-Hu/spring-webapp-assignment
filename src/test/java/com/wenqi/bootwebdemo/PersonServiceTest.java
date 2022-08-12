package com.wenqi.bootwebdemo;

import com.wenqi.bootwebdemo.dao.PersonRepo;
import com.wenqi.bootwebdemo.exception.PersonNotFoundException;
import com.wenqi.bootwebdemo.model.Person;
import com.wenqi.bootwebdemo.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    @Mock
    PersonRepo personRepo;

    @Test
    public void getPersonById() throws Exception {
        PersonService personService = new PersonService(personRepo);

        //Mock personRepo behavior
        Person person = new Person(1, "Yunlong", "Chinese");
        when(personRepo.getPersonByIdWithTemplate(1)).thenReturn(Optional.of(person));

        String result = personService.getPersonById(1);

        assertThat(result).isEqualTo("Ni hao! Wo shi Yunlong.");

        verify(personRepo).getPersonByIdWithTemplate(1);
    }

    @Test
    public void getPersonByIdNotFound() {
        PersonService personService = new PersonService(personRepo);

        Optional<Person> person = Optional.empty();

        when(personRepo.getPersonByIdWithTemplate(100)).thenReturn(person);

        assertThrows(PersonNotFoundException.class, () -> {
            String result = personService.getPersonById(100);
        });

        verify(personRepo).getPersonByIdWithTemplate(100);
    }
}
