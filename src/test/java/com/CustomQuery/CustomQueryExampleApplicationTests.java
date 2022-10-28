package com.CustomQuery;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CustomQueryExampleApplicationTests {

	public final static Logger logger = LoggerFactory.getLogger(CustomQueryExampleApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test");
	}

}
