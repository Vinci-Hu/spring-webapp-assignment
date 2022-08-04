package com.wenqi.bootwebdemo.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonDbConfiguration {
    // Can define Datasource and JdbcTemplate Beans in this class
    // Here empty because h2 database would be recognized by spring automatically
    //      as we set up in property file
}
