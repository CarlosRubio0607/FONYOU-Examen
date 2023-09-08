package com.example.arquetipoApi.Service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.arquetipoApi.Service.CatalogoService;
import com.example.arquetipoApi.model.assembler.CiudadMapper;
import com.example.arquetipoApi.model.response.EsccCiudadDto;
import com.example.arquetipoApi.persistence.entity.EsccCiudad;
import com.example.arquetipoApi.persistence.repository.EsccCiudadRepository;

@Service
public class CatalogoServiceImpl implements CatalogoService{
	
	private final static Logger logger = LoggerFactory.getLogger(CatalogoServiceImpl.class);

	@Autowired
	public CiudadMapper CiudadMapper;
	
	@Autowired
	public EsccCiudadRepository esccCiudadRepository;
	
	@Override
	public ResponseEntity<?> getCatalogoCiudad() {
		
		List<EsccCiudadDto> list = null;
		try {
			logger.info("CatalogosService getCatalogoCiudad");
			List<EsccCiudad> listEnt = esccCiudadRepository.findAll();
			list = CiudadMapper.toLstDto(listEnt);
			if (listEnt.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			logger.error("----->>>>> Error" + e);
			return new ResponseEntity<>("Error al obtener el catalogo", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

}
