package com.wenqi.bootwebdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
	private static Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
//		Person p1 = context.getBean(Person.class);
//		p1.breathe();
		logger.info("Web server is running...");

	}

}
