package com.example.arquetipoApi.Service;

import org.springframework.http.ResponseEntity;

import com.example.arquetipoApi.model.response.EsctExamenDto;

public interface ExamenService {
	
	ResponseEntity<?> getCatalogoExamen();
	
	ResponseEntity<?> saveExamen(EsctExamenDto examen);
	
}
