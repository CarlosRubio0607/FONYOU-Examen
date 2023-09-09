package com.example.arquetipoApi.model.assembler;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.arquetipoApi.model.response.EsctExamenDto;
import com.example.arquetipoApi.model.response.EsctExamenPreguntaDto;
import com.example.arquetipoApi.persistence.entity.EsctExamen;
import com.example.arquetipoApi.persistence.entity.EsctExamenPregunta;

@Mapper(componentModel = "spring")
public interface ExamenMapper {

	ExamenMapper INSTANCE = Mappers.getMapper(ExamenMapper.class);

	EsctExamen toEntity(EsctExamenDto dto);

	EsctExamenDto toDtoRec(EsctExamen entity);

//	public List<EsctExamenDto> toLstDto(List<EsctExamen> entity);
	List<EsctExamen> toLstEntity(List<EsctExamenDto> dto);
	
	public default List<EsctExamenDto> from(List<EsctExamen> entity) {
    	
    	if ( entity == null ) {
            return null;
        }

        List<EsctExamenDto> list = new ArrayList<EsctExamenDto>( entity.size() );
        for ( EsctExamen esctExamen : entity ) {
            list.add( toDtoRec1( esctExamen ) );
        }

        return list;
        
    }
    
    public static EsctExamenDto toDtoRec1(EsctExamen entity) {
    	if ( entity == null ) {
            return null;
        }

        EsctExamenDto esctExamenDto = new EsctExamenDto();

        esctExamenDto.setCveExamen( entity.getCveExamen() );
        esctExamenDto.setCveUsuarioAlta( entity.getCveUsuarioAlta() );
        esctExamenDto.setCveUsuarioBaja( entity.getCveUsuarioBaja() );
        esctExamenDto.setCveUsuarioModifica( entity.getCveUsuarioModifica() );
        esctExamenDto.setFecAlta( entity.getFecAlta() );
        esctExamenDto.setFecBaja( entity.getFecBaja() );
        esctExamenDto.setFecExamenBogota( entity.getFecExamenBogota() );
        esctExamenDto.setFecModifica( entity.getFecModifica() );
        esctExamenDto.setNomExamen( entity.getNomExamen() );
        
        ArrayList<EsctExamenPreguntaDto> esctExamenPreguntaDtoList = new ArrayList<>();
        
        if (!entity.getCveExamenEsctExamenPreguntas().isEmpty()) {
        	for (EsctExamenPregunta esctExamenPregunta : entity.getCveExamenEsctExamenPreguntas()) {
        		EsctExamenPreguntaDto esctExamenPreguntaDto = new EsctExamenPreguntaDto();
        		esctExamenPreguntaDto.setCvePregunta(esctExamenPregunta.getCvePregunta());
        		esctExamenPreguntaDto.setPregunta(esctExamenPregunta.getPregunta());
        		esctExamenPreguntaDto.setOpsUno(esctExamenPregunta.getOpsUno());
        		esctExamenPreguntaDto.setOpsDos(esctExamenPregunta.getOpsDos());
        		esctExamenPreguntaDto.setOpsTres(esctExamenPregunta.getOpsTres());
        		esctExamenPreguntaDto.setOpsCuatro(esctExamenPregunta.getOpsCuatro());
        		esctExamenPreguntaDto.setOpsCorrecta(esctExamenPregunta.getOpsCorrecta());
        		esctExamenPreguntaDto.setFecAlta(esctExamenPregunta.getFecAlta());
        		esctExamenPreguntaDtoList.add(esctExamenPreguntaDto);
			}
			
		}
        esctExamenDto.setEsctExamenPregunta(esctExamenPreguntaDtoList);

        return esctExamenDto;
    }
	
}
