package com.CustomQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomQueryExampleApplication {

	public final static Logger logger = LoggerFactory.getLogger(CustomQueryExampleApplication.class);

	public static void main(String[] args) {
		logger.info("Integration");
		SpringApplication.run(CustomQueryExampleApplication.class, args);
	}

}
