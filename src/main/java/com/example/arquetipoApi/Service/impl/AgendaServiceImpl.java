package com.example.arquetipoApi.Service.impl;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.arquetipoApi.Service.AgendaService;
import com.example.arquetipoApi.constants.Constantes;
import com.example.arquetipoApi.constants.ConstantesMensajesSistema;
import com.example.arquetipoApi.exceptions.IntencionalException;
import com.example.arquetipoApi.model.assembler.AgendaMapper;
import com.example.arquetipoApi.model.response.EsctAlumnoAgendaExamenDto;
import com.example.arquetipoApi.model.response.ResponseServiceDTO;
import com.example.arquetipoApi.persistence.entity.EsctAlumno;
import com.example.arquetipoApi.persistence.entity.EsctAlumnoAgendaExamen;
import com.example.arquetipoApi.persistence.entity.EsctExamen;
import com.example.arquetipoApi.persistence.repository.EsctAlumnoAgendaExamenRepository;
import com.example.arquetipoApi.persistence.repository.EsctAlumnoRepository;
import com.example.arquetipoApi.persistence.repository.EsctExamenRepository;
import com.example.arquetipoApi.utils.DateTimeConverter;
import com.example.arquetipoApi.utils.ObjectMapperUtils;

@Service
public class AgendaServiceImpl implements AgendaService{
	
	@Autowired
	public EsctAlumnoAgendaExamenRepository esctAlumnoAgendaExamenRepository;
	
	@Autowired
	public AgendaMapper agendaMapper;
	
	@Autowired
	public EsctExamenRepository esctExamenRepository;
	
	@Autowired
	public EsctAlumnoRepository esctAlumnoRepository;
	
	private final static Logger logger = LoggerFactory.getLogger(AgendaServiceImpl.class);

	@Override
	public ResponseEntity<?> getCatalogoAgenda() {
		
		List<EsctAlumnoAgendaExamenDto> list = null;
		List<EsctAlumnoAgendaExamen> listEnt = null;
		try {
			logger.info("AgendaServiceImpl ");
			listEnt = esctAlumnoAgendaExamenRepository.getAllAgendas();
//			listEnt = esctAlumnoAgendaExamenRepository.findAll();
			list = agendaMapper.toLstDto(listEnt);
			if (list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.error("----->>>>> Error" + e);
			return new ResponseEntity<>("Error al obtener el catalogo", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(listEnt, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> saveAgenda(EsctAlumnoAgendaExamenDto agenda) {
		ResponseServiceDTO response = new ResponseServiceDTO();
		EsctAlumnoAgendaExamen alumnoAgenda = new EsctAlumnoAgendaExamen();
		
		try {
			
			validaCamposObligatorios(agenda);
			
			alumnoAgenda = ObjectMapperUtils.map(agenda, EsctAlumnoAgendaExamen.class);
			alumnoAgenda.setFecAlta(new Date());
			
				
			alumnoAgenda.setFecExamenAplicacion(calculaFechaByZonaHoraria(agenda));
			
			esctAlumnoAgendaExamenRepository.save(alumnoAgenda);
			
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
	
	private Date calculaFechaByZonaHoraria(EsctAlumnoAgendaExamenDto agenda) {
		
		Optional<EsctExamen> entExamen= esctExamenRepository.findById(agenda.getCveExamen().getCveExamen());
		Optional<EsctAlumno> entAlumno= esctAlumnoRepository.findById(agenda.getCveAlumno().getCveAlumno());
		
		ZonedDateTime fecha = ZonedDateTime.of(DateTimeConverter.fromDateToLocalDateTime(entExamen.get().getFecExamenBogota()), 
							  ZoneId.of(entAlumno.get().getCveCiudad().getZonaHoraria()));

		Date dateReturn = new Date();
		dateReturn = Date.from(fecha.toInstant());
		
		return dateReturn;
	}

	private void validaCamposObligatorios(EsctAlumnoAgendaExamenDto agenda) throws IntencionalException {
		
		if(agenda.getCveAlumno() == null){
			throw new IntencionalException(Constantes.ERROR_DATOS_CVE_ALUMNO);
		}
		if((agenda.getCveExamen() == null)){
			throw new IntencionalException(Constantes.ERROR_DATOS_CVE_EXAMEN);
		}
		if((agenda.getCveUsuarioAlta() == null)){
			throw new IntencionalException(Constantes.ERROR_DATOS_CLAVE_USUARIO);
		}
	}
	
}
