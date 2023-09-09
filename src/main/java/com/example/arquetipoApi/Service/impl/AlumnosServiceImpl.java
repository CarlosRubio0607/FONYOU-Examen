package com.example.arquetipoApi.Service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.arquetipoApi.Service.AlumnosService;
import com.example.arquetipoApi.model.assembler.AlumnoMapper;
import com.example.arquetipoApi.model.response.EsctAlumnoDto;
import com.example.arquetipoApi.model.response.EsctExamenDto;
import com.example.arquetipoApi.persistence.entity.EsctAlumno;
import com.example.arquetipoApi.persistence.repository.EsctAlumnoRepository;

@Service
public class AlumnosServiceImpl implements AlumnosService{
	
	@Autowired
	public EsctAlumnoRepository esctAlumnoRepository;
	
	@Autowired
	public AlumnoMapper alumnoMapper;
	
	private final static Logger logger = LoggerFactory.getLogger(AlumnosServiceImpl.class);

	@Override
	public ResponseEntity<?> getCatalogoAlumnos() {
		List<EsctAlumnoDto> list = null;
		List<EsctAlumno> listEnt = null;
		try {
			logger.info("ExamenService getCatalogoExamen");
			listEnt = esctAlumnoRepository.findAll();
			list = alumnoMapper.toLstDto(listEnt);
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.error("----->>>>> Error" + e);
			return new ResponseEntity<>("Error al obtener el catalogo", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> saveAlumnos(EsctExamenDto examen) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
