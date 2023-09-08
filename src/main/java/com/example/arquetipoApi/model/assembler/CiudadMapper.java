package com.example.arquetipoApi.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.arquetipoApi.model.response.EsccCiudadDto;
import com.example.arquetipoApi.persistence.entity.EsccCiudad;

@Mapper(componentModel = "spring")
public interface CiudadMapper {

	CiudadMapper INSTANCE = Mappers.getMapper(CiudadMapper.class);

	EsccCiudad toEntity(EsccCiudadDto dto);

	EsccCiudadDto toDtoRec(EsccCiudad entity);

	public List<EsccCiudadDto> toLstDto(List<EsccCiudad> entity);
	List<EsccCiudad> toLstEntity(List<EsccCiudadDto> dto);
}
