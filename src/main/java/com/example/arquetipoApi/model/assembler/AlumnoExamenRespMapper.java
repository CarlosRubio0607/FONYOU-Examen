package com.example.arquetipoApi.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.arquetipoApi.model.response.EsctAlumnoExamenRespDto;
import com.example.arquetipoApi.persistence.entity.EsctAlumnoExamenResp;

@Mapper(componentModel = "spring")
public interface AlumnoExamenRespMapper {
	
	AlumnoExamenRespMapper INSTANCE = Mappers.getMapper(AlumnoExamenRespMapper.class);

	EsctAlumnoExamenResp toEntity(EsctAlumnoExamenRespDto dto);

	EsctAlumnoExamenRespDto toDtoRec(EsctAlumnoExamenResp entity);

	public List<EsctAlumnoExamenRespDto> toLstDto(List<EsctAlumnoExamenResp> entity);
	List<EsctAlumnoExamenResp> toLstEntity(List<EsctAlumnoExamenRespDto> dto);
}
