package com.example.arquetipoApi.persistence.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "esct_alumno_agenda_examen")
public class EsctAlumnoAgendaExamen {

    @Id
    @Column(name = "CVE_ALUMNO_AGENDA", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cveAlumnoAgenda;

    @Column(name = "FEC_EXAMEN_APLICACION", nullable = false)
    private Date fecExamenAplicacion;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_ALUMNO", referencedColumnName = "CVE_ALUMNO")
    private EsctAlumno cveAlumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CVE_EXAMEN", referencedColumnName = "CVE_EXAMEN")
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
