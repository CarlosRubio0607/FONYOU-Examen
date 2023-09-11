package com.example.arquetipoApi.Service;

import org.springframework.http.ResponseEntity;

import com.example.arquetipoApi.model.response.EsctAlumnoAgendaExamenDto;

public interface AgendaService {
	
	ResponseEntity<?> getCatalogoAgenda();
	
	ResponseEntity<?> saveAgenda(EsctAlumnoAgendaExamenDto agenda);
	
}
