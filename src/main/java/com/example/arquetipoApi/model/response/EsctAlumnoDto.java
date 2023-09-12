package com.example.arquetipoApi.model.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import com.example.arquetipoApi.persistence.entity.EsccCiudad;

import lombok.Data;

@Data
public class EsctAlumnoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer cveAlumno;
	private String nomNombre;
	private String nomPaterno;
	private String nomMaterno;
	private Integer edad;
	private Date fecAlta;
	private Date fecBaja;
	private Date fecModifica;
	private String cveUsuarioAlta;
	private String cveUsuarioBaja;
	private String cveUsuarioModifica;
	private EsccCiudad cveCiudad;
	private ArrayList<EsctAlumnoAgendaExamenDto> cveAlumnoEsctAlumnoAgendaExamens;
	private ArrayList<EsctAlumnoExamenDto> cveAlumnoEsctAlumnoExamens;
	
	public Integer getCveAlumno() {
		return cveAlumno;
	}
	public void setCveAlumno(Integer cveAlumno) {
		this.cveAlumno = cveAlumno;
	}
	public String getNomNombre() {
		return nomNombre;
	}
	public void setNomNombre(String nomNombre) {
		this.nomNombre = nomNombre;
	}
	public String getNomPaterno() {
		return nomPaterno;
	}
	public void setNomPaterno(String nomPaterno) {
		this.nomPaterno = nomPaterno;
	}
	public String getNomMaterno() {
		return nomMaterno;
	}
	public void setNomMaterno(String nomMaterno) {
		this.nomMaterno = nomMaterno;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
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
	public EsccCiudad getCveCiudad() {
		return cveCiudad;
	}
	public void setCveCiudad(EsccCiudad cveCiudad) {
		this.cveCiudad = cveCiudad;
	}
	public ArrayList<EsctAlumnoAgendaExamenDto> getCveAlumnoEsctAlumnoAgendaExamens() {
		return cveAlumnoEsctAlumnoAgendaExamens;
	}
	public void setCveAlumnoEsctAlumnoAgendaExamens(ArrayList<EsctAlumnoAgendaExamenDto> cveAlumnoEsctAlumnoAgendaExamens) {
		this.cveAlumnoEsctAlumnoAgendaExamens = cveAlumnoEsctAlumnoAgendaExamens;
	}
	public ArrayList<EsctAlumnoExamenDto> getCveAlumnoEsctAlumnoExamens() {
		return cveAlumnoEsctAlumnoExamens;
	}
	public void setCveAlumnoEsctAlumnoExamens(ArrayList<EsctAlumnoExamenDto> cveAlumnoEsctAlumnoExamens) {
		this.cveAlumnoEsctAlumnoExamens = cveAlumnoEsctAlumnoExamens;
	}
		
	
}
