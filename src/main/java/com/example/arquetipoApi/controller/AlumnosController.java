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

import com.example.arquetipoApi.Service.AlumnosService;
import com.example.arquetipoApi.model.response.EsctAlumnoDto;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AlumnosController {
	
	private final static Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private  AlumnosService AlumnosService;

	@GetMapping("/getCatalogoAlumnos")
	@ResponseBody
	public ResponseEntity<?> registro() {
		logger.info("::::::::::: Get de catalogos de examenes :::::::::::");
		return AlumnosService.getCatalogoAlumnos();
	}
	
	@PostMapping("/saveAlumnos")
	public ResponseEntity<?> save(@RequestBody EsctAlumnoDto examen) {
		return AlumnosService.saveAlumnos(examen);

	}
}