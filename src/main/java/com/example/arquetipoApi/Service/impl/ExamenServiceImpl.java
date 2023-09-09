package com.example.arquetipoApi.Service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.arquetipoApi.Service.ExamenService;
import com.example.arquetipoApi.constants.Constantes;
import com.example.arquetipoApi.constants.ConstantesMensajesSistema;
import com.example.arquetipoApi.exceptions.IntencionalException;
import com.example.arquetipoApi.model.assembler.ExamenMapper;
import com.example.arquetipoApi.model.response.EsctExamenDto;
import com.example.arquetipoApi.model.response.EsctExamenPreguntaDto;
import com.example.arquetipoApi.model.response.ResponseServiceDTO;
import com.example.arquetipoApi.persistence.entity.EsctExamen;
import com.example.arquetipoApi.persistence.entity.EsctExamenPregunta;
import com.example.arquetipoApi.persistence.repository.EsctExamenPreguntaRepository;
import com.example.arquetipoApi.persistence.repository.EsctExamenRepository;
import com.example.arquetipoApi.utils.ObjectMapperUtils;

@Service
public class ExamenServiceImpl implements ExamenService{
	
	private final static Logger logger = LoggerFactory.getLogger(ExamenServiceImpl.class);

	@Autowired
	public ExamenMapper examenMapper;
	
	@Autowired
	public EsctExamenRepository esctExamenRepository;
	
	@Autowired
	public EsctExamenPreguntaRepository esctExamenPreguntaRepository;

	@Override
	public ResponseEntity<?> getCatalogoExamen() {
		List<EsctExamenDto> list = null;
		try {
			logger.info("ExamenService getCatalogoExamen");
			List<EsctExamen> listEnt = esctExamenRepository.findAll();
			list = examenMapper.from(listEnt);
			if (listEnt.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.error("----->>>>> Error" + e);
			return new ResponseEntity<>("Error al obtener el catalogo", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> saveExamen(EsctExamenDto examen) {
		ResponseServiceDTO response = new ResponseServiceDTO();
		EsctExamen esctExamen = new EsctExamen();
		EsctExamenPregunta esctExamenPregunta = new EsctExamenPregunta();
		try {
			
			validaCamposObligatorios(examen);
			
			esctExamen = ObjectMapperUtils.map(examen, EsctExamen.class);
			esctExamen.setFecAlta(new Date());
			EsctExamen esctExamenDBO = esctExamenRepository.save(esctExamen);
					
			for (EsctExamenPreguntaDto examenPregunta : examen.getEsctExamenPregunta()) {
				esctExamenPregunta = ObjectMapperUtils.map(examenPregunta, EsctExamenPregunta.class);
				esctExamenPregunta.setCveExamen(esctExamenDBO);
				esctExamenPregunta.setFecAlta(new Date());
				esctExamenPreguntaRepository.save(esctExamenPregunta);
			}
			
			response.setMensaje(ConstantesMensajesSistema.EXITO_CONSULTA);
			response.setCode(HttpStatus.OK.value());
			response.setEstatus(true);

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

	private void validaCamposObligatorios(EsctExamenDto examen) throws IntencionalException {
		// TODO Auto-generated method stub
		if((examen.getNomExamen() == null || examen.getNomExamen().length() == 0)) {
			throw new IntencionalException(Constantes.ERROR_DATOS_NOMBRE);
		}
		
		if((examen.getFecExamenBogota() == null)) {
			throw new IntencionalException(Constantes.ERROR_DATOS_FECHA_APLICACION);
		}
		
		if((examen.getCveUsuarioAlta() == null || examen.getCveUsuarioAlta().length() == 0)) {
			throw new IntencionalException(Constantes.ERROR_DATOS_CLAVE_USUARIO);
		}
		
		if (examen.getEsctExamenPregunta() == null) {
			throw new IntencionalException(Constantes.ERROR_DATOS_PREGUNTA_OBIGATORIA);
		}
	}

}
