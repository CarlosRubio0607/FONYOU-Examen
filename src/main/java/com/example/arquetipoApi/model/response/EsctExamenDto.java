package com.example.arquetipoApi.model.response;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class EsctExamenDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer cveExamen;
	private String nomExamen;
	private Date fecExamenBogota;
	private Date fecAlta;
	private OffsetDateTime fecBaja;
	private OffsetDateTime fecModifica;
	private String cveUsuarioAlta;
	private String cveUsuarioBaja;
	private String cveUsuarioModifica;
	
	private ArrayList<EsctExamenPreguntaDto> esctExamenPregunta;
	
	public Integer getCveExamen() {
		return cveExamen;
	}
	public void setCveExamen(Integer cveExamen) {
		this.cveExamen = cveExamen;
	}
	public String getNomExamen() {
		return nomExamen;
	}
	public void setNomExamen(String nomExamen) {
		this.nomExamen = nomExamen;
	}
	public Date getFecExamenBogota() {
		return fecExamenBogota;
	}
	public void setFecExamenBogota(Date fecExamenBogota) {
		this.fecExamenBogota = fecExamenBogota;
	}
	public Date getFecAlta() {
		return fecAlta;
	}
	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}
	public OffsetDateTime getFecBaja() {
		return fecBaja;
	}
	public void setFecBaja(OffsetDateTime fecBaja) {
		this.fecBaja = fecBaja;
	}
	public OffsetDateTime getFecModifica() {
		return fecModifica;
	}
	public void setFecModifica(OffsetDateTime fecModifica) {
		this.fecModifica = fecModifica;
	}
	public String getCveUsuarioAlta() {
		return cveUsuarioAlta;
	}
	public void setCveUsuarioAlta(String cveUsuarioAlta) {
		this.cveUsuarioAlta = cveUsuarioAlta;
	}
	public String getCveUsuarioBaja() {
		return cveUsuarioBaja;
	}
	public void setCveUsuarioBaja(String cveUsuarioBaja) {
		this.cveUsuarioBaja = cveUsuarioBaja;
	}
	public String getCveUsuarioModifica() {
		return cveUsuarioModifica;
	}
	public void setCveUsuarioModifica(String cveUsuarioModifica) {
		this.cveUsuarioModifica = cveUsuarioModifica;
	}
	public List<EsctExamenPreguntaDto> getEsctExamenPregunta() {
		return esctExamenPregunta;
	}
	public void setEsctExamenPregunta(ArrayList<EsctExamenPreguntaDto> esctExamenPregunta) {
		this.esctExamenPregunta = esctExamenPregunta;
	}
	
	
	

}
