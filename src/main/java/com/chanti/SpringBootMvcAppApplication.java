package com.chanti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMvcAppApplication {

	public static Logger LOG=LoggerFactory.getLogger(SpringBootMvcAppApplication.class);
	public static void main(String[] args) {
		LOG.info("inside main");
		SpringApplication.run(SpringBootMvcAppApplication.class, args);
	}

}
