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

import com.example.arquetipoApi.Service.AgendaService;
import com.example.arquetipoApi.model.response.EsctAlumnoAgendaExamenDto;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AgendaController {
	
	private final static Logger logger = LoggerFactory.getLogger(AgendaController.class);

	@Autowired
	private  AgendaService agendaService;

	@GetMapping("/getCatalogoAgenda")
	@ResponseBody
	public ResponseEntity<?> registro() {
		logger.info("::::::::::: Get de catalogos de Agenda :::::::::::");
		return agendaService.getCatalogoAgenda();
	}
	
	@PostMapping("/saveAgenda")
	public ResponseEntity<?> save(@RequestBody EsctAlumnoAgendaExamenDto examen) {
		logger.info("::::::::::: Save de Agenda :::::::::::");
		return agendaService.saveAgenda(examen);

	}
}