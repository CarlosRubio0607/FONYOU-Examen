package com.example.arquetipoApi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {
	
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value ="/test", method = RequestMethod.GET)
	@ResponseBody
	public String registro() {
		logger.info("::::::::::: Registro de :::::::::::");
		return "Hola mundo...!!!";
	}
}
