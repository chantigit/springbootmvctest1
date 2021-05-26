package com.chanti;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootMvcAppApplicationTests {

	public static Logger LOG=LoggerFactory.getLogger(SpringBootMvcAppApplicationTests.class);
	@Test
	void contextLoads() {
		LOG.info("inside test1");
		assertEquals(true,true);
	}

}
