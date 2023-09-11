package com.example.arquetipoApi.model.assembler;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.arquetipoApi.model.response.EsctAlumnoAgendaExamenDto;
import com.example.arquetipoApi.persistence.entity.EsctAlumnoAgendaExamen;

@Mapper(componentModel = "spring")
public interface AgendaMapper {
	
	AgendaMapper INSTANCE = Mappers.getMapper(AgendaMapper.class);

	EsctAlumnoAgendaExamen toEntity(EsctAlumnoAgendaExamenDto dto);

	EsctAlumnoAgendaExamenDto toDtoRec(EsctAlumnoAgendaExamen entity);

	public List<EsctAlumnoAgendaExamenDto> toLstDto(List<EsctAlumnoAgendaExamen> entity);
	List<EsctAlumnoAgendaExamen> toLstEntity(List<EsctAlumnoAgendaExamenDto> dto);
}
