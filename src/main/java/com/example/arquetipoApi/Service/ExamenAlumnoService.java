package com.example.arquetipoApi.Service;

import org.springframework.http.ResponseEntity;

import com.example.arquetipoApi.model.response.EsctAlumnoExamenDto;

public interface ExamenAlumnoService {
	
	ResponseEntity<?> getListRegistroExamenByAlumno();
	
	ResponseEntity<?> saveExamenByAlumno(EsctAlumnoExamenDto examen);
	
}
