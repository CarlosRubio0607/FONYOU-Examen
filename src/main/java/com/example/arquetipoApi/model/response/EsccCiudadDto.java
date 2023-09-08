package com.example.arquetipoApi.model.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class EsccCiudadDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer cveCiudad;
    private String nomCiudad;
    private String zonaHoraria;
    
	public Integer getCveCiudad() {
		return cveCiudad;
	}
	public void setCveCiudad(Integer cveCiudad) {
		this.cveCiudad = cveCiudad;
	}
	public String getNomCiudad() {
		return nomCiudad;
	}
	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}
	public String getZonaHoraria() {
		return zonaHoraria;
	}
	public void setZonaHoraria(String zonaHoraria) {
		this.zonaHoraria = zonaHoraria;
	}

}
