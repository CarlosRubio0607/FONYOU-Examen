package com.example.arquetipoApi.model.response;

import java.io.Serializable;
import java.util.Date;

import com.example.arquetipoApi.persistence.entity.EsctAlumno;
import com.example.arquetipoApi.persistence.entity.EsctExamen;

import lombok.Data;

@Data
public class EsctAlumnoAgendaExamenDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer cveAlumnoAgenda;
	private Date fecExamenAplicacion;
	private Date fecAlta;
	private Date fecBaja;
	private Date fecModifica;
	private String cveUsuarioAlta;
	private String cveUsuarioBaja;
	private String cveUsuarioModifica;
	private EsctAlumno cveAlumno;
	private EsctExamen cveExamen;
	public Integer getCveAlumnoAgenda() {
		return cveAlumnoAgenda;
	}
	public void setCveAlumnoAgenda(Integer cveAlumnoAgenda) {
		this.cveAlumnoAgenda = cveAlumnoAgenda;
	}
	public Date getFecExamenAplicacion() {
		return fecExamenAplicacion;
	}
	public void setFecExamenAplicacion(Date fecExamenAplicacion) {
		this.fecExamenAplicacion = fecExamenAplicacion;
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
	public EsctAlumno getCveAlumno() {
		return cveAlumno;
	}
	public void setCveAlumno(EsctAlumno cveAlumno) {
		this.cveAlumno = cveAlumno;
	}
	public EsctExamen getCveExamen() {
		return cveExamen;
	}
	public void setCveExamen(EsctExamen cveExamen) {
		this.cveExamen = cveExamen;
	}
	
	
	
	
}
