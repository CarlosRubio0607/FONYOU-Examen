package com.example.arquetipoApi.persistence.entity;

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "esct_examen")
public class EsctExamen {

	@Id
    @Column(name = "CVE_EXAMEN", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cveExamen;

    @Column(name = "NOM_EXAMEN", nullable = false, length = 100)
    private String nomExamen;

    @Column(name = "FEC_EXAMEN_BOGOTA", nullable = false)
    private Date fecExamenBogota;

    @Column(name = "FEC_ALTA", nullable = false)
    private Date fecAlta;

    @Column(name = "FEC_BAJA")
    private OffsetDateTime fecBaja;

    @Column(name = "FEC_MODIFICA")
    private OffsetDateTime fecModifica;

    @Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Column(name = "CVE_USUARIO_BAJA", length = 60)
    private String cveUsuarioBaja;

    @Column(name = "CVE_USUARIO_MODIFICA", length = 60)
    private String cveUsuarioModifica;

    @OneToMany(mappedBy = "cveExamen", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<EsctExamenPregunta> cveExamenEsctExamenPreguntas;

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

	public List<EsctExamenPregunta> getCveExamenEsctExamenPreguntas() {
		return cveExamenEsctExamenPreguntas;
	}

	public void setCveExamenEsctExamenPreguntas(List<EsctExamenPregunta> cveExamenEsctExamenPreguntas) {
		this.cveExamenEsctExamenPreguntas = cveExamenEsctExamenPreguntas;
	}

	
    

}
