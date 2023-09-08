package com.example.arquetipoApi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.arquetipoApi.Service.CatalogoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CatalogosController {
	
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private CatalogoService catalogoService;

	@GetMapping("/getCatalogoCiudad")
	@ResponseBody
	public ResponseEntity<?> registro() {
		logger.info("::::::::::: Get de catalogos ciudad :::::::::::");
		return catalogoService.getCatalogoCiudad();
	}
}