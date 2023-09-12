package com.example.arquetipoApi.persistence.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "esct_alumno_examen_resp")
public class EsctAlumnoExamenResp {

	@Id
    @Column(name = "CVE_ALUMNO_RESPUESTA", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cveAlumnoRespuesta;

    @Column(name = "RESPUESTA", nullable = false)
    private String respuesta;

    @Column(name = "FEC_ALTA", nullable = false)
    private Date fecAlta;

    @Column(name = "FEC_BAJA")
    private Date fecBaja;

    @Column(name = "FEC_MODIFICA")
    private Date fecModifica;

    @Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Column(name = "CVE_USUARIO_BAJA", length = 60)
    private String cveUsuarioBaja;

    @Column(name = "CVE_USUARIO_MODIFICA", length = 60)
    private String cveUsuarioModifica;

    @ManyToOne
    @JoinColumn(name = "cve_alumno_examen")
    @JsonIgnore
    private EsctAlumnoExamen esctAlumnoExamen;
    
    @ManyToOne
    @JoinColumn(name = "CVE_PREGUNTA")
    @JsonIgnore
    private EsctExamenPregunta esctExamenPregunta;

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

	public EsctAlumnoExamen getEsctAlumnoExamen() {
		return esctAlumnoExamen;
	}

	public void setEsctAlumnoExamen(EsctAlumnoExamen esctAlumnoExamen) {
		this.esctAlumnoExamen = esctAlumnoExamen;
	}

	public EsctExamenPregunta getEsctExamenPregunta() {
		return esctExamenPregunta;
	}

	public void setEsctExamenPregunta(EsctExamenPregunta esctExamenPregunta) {
		this.esctExamenPregunta = esctExamenPregunta;
	}

	
}
