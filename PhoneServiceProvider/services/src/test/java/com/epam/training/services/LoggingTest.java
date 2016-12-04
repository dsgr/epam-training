package com.epam.training.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-db-context.xml")
public class LoggingTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingTest.class);

	@Test
	public void loggerTest() {
		LOGGER.debug("DEBUG message");
		LOGGER.info("INFO message");
		LOGGER.warn("WARN message");
		LOGGER.error("ERROR message");

	}
}
