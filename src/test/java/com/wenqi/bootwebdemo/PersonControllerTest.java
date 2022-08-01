package com.wenqi.bootwebdemo;

import com.wenqi.bootwebdemo.controller.PersonController;
import com.wenqi.bootwebdemo.model.Person;
import com.wenqi.bootwebdemo.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PersonController.class)
public class PersonControllerTest {
    @MockBean
    PersonService personService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetById() throws Exception{
        Person person = new Person(1,"Yunlong","Chinese");
        when(personService.getPersonById(1)).thenReturn("Ni hao! Wo shi Yunlong.");

        MvcResult result = mockMvc.perform(
                get("/person/1"))
                .andExpect(status().isOk())
                .andReturn();
        String content = result.getResponse().getContentAsString();
        assertThat(content).isEqualTo("Ni hao! Wo shi Yunlong.");

        // Verify the function is called 1ce
        verify(personService).getPersonById(1);
    }

}
