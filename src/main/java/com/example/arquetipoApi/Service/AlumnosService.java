package com.example.arquetipoApi.Service;

import org.springframework.http.ResponseEntity;

import com.example.arquetipoApi.model.response.EsctAlumnoDto;

public interface AlumnosService {
	
	ResponseEntity<?> getCatalogoAlumnos();
	
	ResponseEntity<?> saveAlumnos(EsctAlumnoDto examen);
	
}
