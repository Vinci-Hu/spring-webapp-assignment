package com.wenqi.bootwebdemo.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConfiguration {
    @Bean(name="jsonObjMapper")
    public ObjectMapper jsonObjMapper(){
        return new ObjectMapper();
    }
}
