package com.example.arquetipoApi.model.response;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
	private EsctAlumnoDto cveAlumno;
	private EsctExamenDto cveExamen;
	
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
	public EsctAlumnoDto getCveAlumno() {
		return cveAlumno;
	}
	public void setCveAlumno(EsctAlumnoDto cveAlumno) {
		this.cveAlumno = cveAlumno;
	}
	public EsctExamenDto getCveExamen() {
		return cveExamen;
	}
	public void setCveExamen(EsctExamenDto cveExamen) {
		this.cveExamen = cveExamen;
	}
	
	
	
	
}
