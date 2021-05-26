package com.chanti.rest.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JamesRestController2 
{
	public static Logger LOG=LoggerFactory.getLogger(JamesRestController2.class);
	@GetMapping("/wish")
	public String wish() {
		LOG.info("inside wish endpoint");
		return "Welcome to REST API";
	}
	@GetMapping("/bye")
	public String wish2() {
		LOG.info("inside bye endpoint");
		return "Welcome to REST API";
	}
}
