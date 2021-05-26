package com.chanti.rest.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestController1 
{
	public static Logger LOG=LoggerFactory.getLogger(RestController1.class);
	@GetMapping("/wish")
	public String wish() {
		LOG.info("inside restcontroller");
		return "Welcome to REST API";
	}
}
