package com.example.arquetipoApi.Service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.arquetipoApi.Service.ExamenAlumnoService;
import com.example.arquetipoApi.constants.Constantes;
import com.example.arquetipoApi.constants.ConstantesMensajesSistema;
import com.example.arquetipoApi.exceptions.IntencionalException;
import com.example.arquetipoApi.model.assembler.AlumnoExamenMapper;
import com.example.arquetipoApi.model.assembler.AlumnoExamenRespMapper;
import com.example.arquetipoApi.model.response.EsctAlumnoExamenDto;
import com.example.arquetipoApi.model.response.ResponseServiceDTO;
import com.example.arquetipoApi.persistence.entity.EsctAlumnoExamen;
import com.example.arquetipoApi.persistence.entity.EsctAlumnoExamenResp;
import com.example.arquetipoApi.persistence.entity.EsctExamenPregunta;
import com.example.arquetipoApi.persistence.repository.EsctAlumnoExamenRepository;
import com.example.arquetipoApi.persistence.repository.EsctAlumnoExamenRespRepository;
import com.example.arquetipoApi.persistence.repository.EsctExamenPreguntaRepository;
import com.example.arquetipoApi.utils.ObjectMapperUtils;

@Service
public class ExamenAlumnoServiceImpl implements ExamenAlumnoService{
	
	@Autowired
	public EsctAlumnoExamenRepository esctAlumnoExamenRepository;
	
	@Autowired
	public EsctAlumnoExamenRespRepository esctAlumnoExamenRespRepository;
	
	@Autowired
	public AlumnoExamenMapper alumnoExamenMapper;
	
	@Autowired
	public AlumnoExamenRespMapper alumnoExamenRespMapper;
	
	@Autowired
	public EsctExamenPreguntaRepository esctExamenPreguntaRepository;
	
	private final static Logger logger = LoggerFactory.getLogger(ExamenAlumnoServiceImpl.class);

	@Override
	public ResponseEntity<?> getListRegistroExamenByAlumno() {
		
		List<EsctAlumnoExamenDto> list = null;
		List<EsctAlumnoExamen> listEnt = null;
		try {
			logger.info("ExamenAlumnoServiceImpl ");
			listEnt = esctAlumnoExamenRepository.findAll();
			
			list = alumnoExamenMapper.toLstDto(listEnt);
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.error("----->>>>> Error " + e);
			return new ResponseEntity<>("Error al obtener el catalogo", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> saveExamenByAlumno(EsctAlumnoExamenDto examen) {
		ResponseServiceDTO response = new ResponseServiceDTO();
		EsctAlumnoExamen alumnoExamen = null;
		
		try {
			
			validaCamposObligatorios(examen);
			
			alumnoExamen = ObjectMapperUtils.map(examen, EsctAlumnoExamen.class);
			alumnoExamen.setFecAlta(new Date());
			List<EsctAlumnoExamenResp> esctAlumnoExamenResp = null;
			
			esctAlumnoExamenResp = new ArrayList<>();
			
			Integer promedio = 0;
			Integer total = 0;
			for (EsctAlumnoExamenResp iterable_element : alumnoExamen.getCveAlumnoExamenResp()) {
				iterable_element.setFecAlta(new Date());
				iterable_element.setEsctAlumnoExamen(alumnoExamen);
				
				EsctExamenPregunta listEnt = esctExamenPreguntaRepository.getReferenceById(iterable_element.getEsctExamenPregunta().getCvePregunta());
				
				if (iterable_element.getRespuesta().equalsIgnoreCase(listEnt.getOpsCorrecta())) {
					promedio++;
				}
				total++;
				esctAlumnoExamenResp.add(iterable_element);
			}
			
			calculaPromedio(alumnoExamen, promedio, total);
			
			alumnoExamen.setCveAlumnoExamenResp(esctAlumnoExamenResp);
			
			esctAlumnoExamenRepository.save(alumnoExamen);
			
			response.setMensaje(ConstantesMensajesSistema.EXITO_CONSULTA);
			response.setCode(HttpStatus.OK.value());
			response.setEstatus(true);
			response.setRespuestaPersonalizada("La calificacion de tu examen es: " + alumnoExamen.getCalificacion());

		} catch (IntencionalException ie) {
			response.setCode(HttpStatus.BAD_REQUEST.value());
			response.setMensaje(ie.getMessage());
			response.setEstatus(false);

			logger.warn("Mensaje de validaciones del sistema => " + ie.getMessage());
			
		} catch (Exception e) {
			response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setMensaje(ConstantesMensajesSistema.ERROR_CONSULTA);
			response.setEstatus(false);
			e.printStackTrace();

			logger.error(e.getMessage());
		}
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	
	}

	private void calculaPromedio(EsctAlumnoExamen alumnoExamen, Integer promedio, Integer total) {
		Double div = (double) promedio/total;
		Double multi = (Double) (div*10);
		logger.info("promedio ---> " + multi);
		
		alumnoExamen.setCalificacion(new BigDecimal(multi));
	}

	private void validaCamposObligatorios(EsctAlumnoExamenDto examen) throws IntencionalException {
		
		if((examen.getCveAlumnoExamenResp() == null)) {
			throw new IntencionalException(Constantes.ERROR_DATOS_RESPUESTAS_EXAMEN);
		}
		
		if((examen.getCveAlumno() == null)) {
			throw new IntencionalException(Constantes.ERROR_DATOS_CVE_ALUMNO);
		}
		
		if((examen.getCveExamen() == null)) {
			throw new IntencionalException(Constantes.ERROR_DATOS_CVE_EXAMEN);
		}
		
		if((examen.getCveUsuarioAlta() == null)) {
			throw new IntencionalException(Constantes.ERROR_DATOS_CLAVE_USUARIO);
		}

		
	}

	
}
