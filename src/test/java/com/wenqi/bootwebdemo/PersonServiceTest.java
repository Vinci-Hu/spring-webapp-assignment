package com.wenqi.bootwebdemo;

import com.wenqi.bootwebdemo.dao.PersonRepo;
import com.wenqi.bootwebdemo.model.Person;
import com.wenqi.bootwebdemo.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
        when(personRepo.getPersonById(1)).thenReturn(person);

        String result = personService.getPersonById(1);

        assertThat(result).isEqualTo("Ni hao! Wo shi Yunlong.");

        verify(personRepo).getPersonById(1);
    }
}
