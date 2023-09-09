package com.example.arquetipoApi.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.arquetipoApi.model.response.EsctExamenPreguntaDto;
import com.example.arquetipoApi.persistence.entity.EsctExamenPregunta;

@Mapper(componentModel = "spring")
public interface ExamenPreguntaMapper {

	ExamenPreguntaMapper INSTANCE = Mappers.getMapper(ExamenPreguntaMapper.class);

	EsctExamenPregunta toEntity(EsctExamenPreguntaDto dto);

	EsctExamenPreguntaDto toDtoRec(EsctExamenPregunta entity);

	public List<EsctExamenPreguntaDto> toLstDto(List<EsctExamenPregunta> entity);
	List<EsctExamenPregunta> toLstEntity(List<EsctExamenPreguntaDto> dto);

}
