package com.example.arquetipoApi.model.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EsctAlumnoExamenRespDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer cveAlumnoRespuesta;
	private String respuesta;
	private Date fecAlta;
	private Date fecBaja;
	private Date fecModifica;
	private String cveUsuarioAlta;
	private String cveUsuarioBaja;
	private String cveUsuarioModifica;
	private EsctAlumnoExamenDto cveAlumnoExamen;
	private EsctExamenPreguntaDto esctExamenPregunta;
	
	public Integer getCveAlumnoRespuesta() {
		return cveAlumnoRespuesta;
	}
	public void setCveAlumnoRespuesta(Integer cveAlumnoRespuesta) {
		this.cveAlumnoRespuesta = cveAlumnoRespuesta;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public Date getFecAlta() {
		return fecAlta;
	}
	public void setFecAlta(Date fecAlta) {
		this.fecAlta = fecAlta;
	}
	public Date getFecBaja() {
		return fecBaja;
	}
	public void setFecBaja(Date fecBaja) {
		this.fecBaja = fecBaja;
	}
	public Date getFecModifica() {
		return fecModifica;
	}
	public void setFecModifica(Date fecModifica) {
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
	public EsctAlumnoExamenDto getCveAlumnoExamen() {
		return cveAlumnoExamen;
	}
	public void setCveAlumnoExamen(EsctAlumnoExamenDto cveAlumnoExamen) {
		this.cveAlumnoExamen = cveAlumnoExamen;
	}
	public EsctExamenPreguntaDto getEsctExamenPregunta() {
		return esctExamenPregunta;
	}
	public void setEsctExamenPregunta(EsctExamenPreguntaDto esctExamenPregunta) {
		this.esctExamenPregunta = esctExamenPregunta;
	}
	
	
	
	
}
