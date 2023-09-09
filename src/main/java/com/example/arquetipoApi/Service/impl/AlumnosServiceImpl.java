package com.example.arquetipoApi.Service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.arquetipoApi.Service.AlumnosService;
import com.example.arquetipoApi.constants.Constantes;
import com.example.arquetipoApi.constants.ConstantesMensajesSistema;
import com.example.arquetipoApi.exceptions.IntencionalException;
import com.example.arquetipoApi.model.assembler.AlumnoMapper;
import com.example.arquetipoApi.model.response.EsctAlumnoDto;
import com.example.arquetipoApi.model.response.ResponseServiceDTO;
import com.example.arquetipoApi.persistence.entity.EsctAlumno;
import com.example.arquetipoApi.persistence.repository.EsctAlumnoRepository;
import com.example.arquetipoApi.utils.ObjectMapperUtils;

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
	public ResponseEntity<?> saveAlumnos(EsctAlumnoDto alumno) {
		ResponseServiceDTO response = new ResponseServiceDTO();
		EsctAlumno esctAlumno = new EsctAlumno();
		
		try {
			
			validaCamposObligatorios(alumno);
			
			esctAlumno = ObjectMapperUtils.map(alumno, EsctAlumno.class);
			esctAlumno.setFecAlta(new Date());
			esctAlumnoRepository.save(esctAlumno);
			
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
	
	private void validaCamposObligatorios(EsctAlumnoDto alumno) throws IntencionalException {
		
		if((alumno.getNomNombre() == null || alumno.getNomNombre().length() == 0)){
			throw new IntencionalException(Constantes.ERROR_DATOS_NOMBRE_ALUMNO);
		}
		if((alumno.getNomPaterno() == null || alumno.getNomPaterno().length() == 0)){
			throw new IntencionalException(Constantes.ERROR_DATOS_APELLIDO_MAT);
		}
		if((alumno.getNomMaterno() == null || alumno.getNomMaterno().length() == 0)){
			throw new IntencionalException(Constantes.ERROR_DATOS_APELLIDO_PAT);
		}
		if((alumno.getEdad() == null )){
			throw new IntencionalException(Constantes.ERROR_DATOS_EDAD);
		}
		if((alumno.getCveUsuarioAlta() == null || alumno.getCveUsuarioAlta().length() == 0)){
			throw new IntencionalException(Constantes.ERROR_DATOS_CLAVE_USUARIO);
		}
		if((alumno.getCveCiudad() == null )){
			throw new IntencionalException(Constantes.ERROR_DATOS_CLAVE_CIUDAD);
		}
		
	}


	
}
