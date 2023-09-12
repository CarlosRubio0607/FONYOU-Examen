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

import com.example.arquetipoApi.Service.ExamenAlumnoService;
import com.example.arquetipoApi.model.response.EsctAlumnoExamenDto;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExamenAlumnoController {
	
	private final static Logger logger = LoggerFactory.getLogger(ExamenAlumnoController.class);

	@Autowired
	private  ExamenAlumnoService examenAlumnoService;

	@GetMapping("/getListRegistroExamenByAlumno")
	@ResponseBody
	public ResponseEntity<?> registro() {
		logger.info("::::::::::: Get list de examenes by  alumnos:::::::::::");
		return examenAlumnoService.getListRegistroExamenByAlumno();
	}
	
	@PostMapping("/saveRegistroExamenByAlumno")
	public ResponseEntity<?> save(@RequestBody EsctAlumnoExamenDto examen) {
		logger.info("::::::::::: Save de Agenda :::::::::::");
		return examenAlumnoService.saveExamenByAlumno(examen);

	}
}