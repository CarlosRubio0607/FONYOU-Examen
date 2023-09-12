package com.example.arquetipoApi.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.arquetipoApi.model.response.EsctAlumnoExamenDto;
import com.example.arquetipoApi.persistence.entity.EsctAlumnoExamen;

@Mapper(componentModel = "spring")
public interface AlumnoExamenMapper {
	
	AlumnoExamenMapper INSTANCE = Mappers.getMapper(AlumnoExamenMapper.class);

	EsctAlumnoExamen toEntity(EsctAlumnoExamenDto dto);

	EsctAlumnoExamenDto toDtoRec(EsctAlumnoExamen entity);

	public List<EsctAlumnoExamenDto> toLstDto(List<EsctAlumnoExamen> entity);
	List<EsctAlumnoExamen> toLstEntity(List<EsctAlumnoExamenDto> dto);
}
