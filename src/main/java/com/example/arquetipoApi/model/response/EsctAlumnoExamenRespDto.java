package com.example.arquetipoApi.model.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import com.example.arquetipoApi.persistence.entity.EsctAlumno;
import com.example.arquetipoApi.persistence.entity.EsctAlumnoExamen;
import com.example.arquetipoApi.persistence.entity.EsctAlumnoExamenResp;
import com.example.arquetipoApi.persistence.entity.EsctExamen;
import com.example.arquetipoApi.persistence.entity.EsctExamenPregunta;

import lombok.Data;

@Data
public class EsctAlumnoExamenRespDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer cveAlumnoRespuesta;
	private Integer respuesta;
	private Date fecAlta;
	private Date fecBaja;
	private Date fecModifica;
	private String cveUsuarioAlta;
	private String cveUsuarioBaja;
	private String cveUsuarioModifica;
	private EsctAlumnoExamen cveAlumnoExamen;
	private EsctExamenPregunta cvePregunta;
	public Integer getCveAlumnoRespuesta() {
		return cveAlumnoRespuesta;
	}
	public void setCveAlumnoRespuesta(Integer cveAlumnoRespuesta) {
		this.cveAlumnoRespuesta = cveAlumnoRespuesta;
	}
	public Integer getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(Integer respuesta) {
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
	public EsctAlumnoExamen getCveAlumnoExamen() {
		return cveAlumnoExamen;
	}
	public void setCveAlumnoExamen(EsctAlumnoExamen cveAlumnoExamen) {
		this.cveAlumnoExamen = cveAlumnoExamen;
	}
	public EsctExamenPregunta getCvePregunta() {
		return cvePregunta;
	}
	public void setCvePregunta(EsctExamenPregunta cvePregunta) {
		this.cvePregunta = cvePregunta;
	}
	
	
}
