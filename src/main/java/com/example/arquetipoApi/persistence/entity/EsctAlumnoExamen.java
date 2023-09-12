package com.example.arquetipoApi.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "esct_alumno_examen")
public class EsctAlumnoExamen {


    @Id
    @Column(name = "CVE_ALUMNO_EXAMEN", updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cveAlumnoExamen;

    @Column(name = "CALIFICACION", nullable = false, precision = 3, scale = 1)
    private BigDecimal calificacion;

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
    @JoinColumn(name = "cve_alumno", nullable = false)
    private EsctAlumno cveAlumno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cve_examen", nullable = false)
    private EsctExamen cveExamen;

    @OneToMany(fetch = FetchType.EAGER ,mappedBy = "esctAlumnoExamen", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private List<EsctAlumnoExamenResp> cveAlumnoExamenResp;

	public Integer getCveAlumnoExamen() {
		return cveAlumnoExamen;
	}

	public void setCveAlumnoExamen(Integer cveAlumnoExamen) {
		this.cveAlumnoExamen = cveAlumnoExamen;
	}

	public BigDecimal getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(BigDecimal calificacion) {
		this.calificacion = calificacion;
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

	public List<EsctAlumnoExamenResp> getCveAlumnoExamenResp() {
		return cveAlumnoExamenResp;
	}

	public void setCveAlumnoExamenResp(List<EsctAlumnoExamenResp> cveAlumnoExamenResp) {
		this.cveAlumnoExamenResp = cveAlumnoExamenResp;
	}

	
}
