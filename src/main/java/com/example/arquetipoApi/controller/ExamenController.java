package com.example.arquetipoApi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.arquetipoApi.Service.ExamenService;
import com.example.arquetipoApi.model.response.EsctExamenDto;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExamenController {
	
	private final static Logger logger = LoggerFactory.getLogger(ExamenController.class);

	@Autowired
	private ExamenService examenService;

	@GetMapping("/getCatalogoExamen")
	@ResponseBody
	public ResponseEntity<?> registro() {
		logger.info("::::::::::: Get de catalogos de examenes :::::::::::");
		return examenService.getCatalogoExamen();
	}
	
	@PostMapping("/saveExamen")
	public ResponseEntity<?> save(@RequestBody EsctExamenDto examen) {
		return examenService.saveExamen(examen);

	}
}