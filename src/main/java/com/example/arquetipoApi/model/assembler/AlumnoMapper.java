package com.example.arquetipoApi.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.arquetipoApi.model.response.EsctAlumnoDto;
import com.example.arquetipoApi.persistence.entity.EsctAlumno;

@Mapper(componentModel = "spring")
public interface AlumnoMapper {

	AlumnoMapper INSTANCE = Mappers.getMapper(AlumnoMapper.class);

	EsctAlumno toEntity(EsctAlumnoDto dto);

	EsctAlumnoDto toDtoRec(EsctAlumno entity);

	public List<EsctAlumnoDto> toLstDto(List<EsctAlumno> entity);
	List<EsctAlumno> toLstEntity(List<EsctAlumnoDto> dto);
}
