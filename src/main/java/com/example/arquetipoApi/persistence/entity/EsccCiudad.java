package com.example.arquetipoApi.persistence.entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "escc_ciudad")
public class EsccCiudad {

    @Id
    @Column(name = "CVE_CIUDAD", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cveCiudad;

    @Column(name = "NOM_CIUDAD", nullable = false, length = 100)
    private String nomCiudad;

    @Column(name = "ZONA_HORARIA", nullable = false, length = 100)
    private String zonaHoraria;

    @Column(name = "FEC_ALTA", nullable = false)
    private OffsetDateTime fecAlta;

    @Column(name = "FEC_BAJA")
    private OffsetDateTime fecBaja;

    @Column(name = "FEC_MODIFICA" )
    private OffsetDateTime fecModifica;

    @Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Column(name = "CVE_USUARIO_BAJA", length = 60)
    private String cveUsuarioBaja;

    @Column(name = "CVE_USUARIO_MODIFICA", length = 60)
    private String cveUsuarioModifica;

	public Integer getCveCiudad() {
		return cveCiudad;
	}

	public void setCveCiudad(Integer cveCiudad) {
		this.cveCiudad = cveCiudad;
	}

	public String getNomCiudad() {
		return nomCiudad;
	}

	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}

	public String getZonaHoraria() {
		return zonaHoraria;
	}

	public void setZonaHoraria(String zonaHoraria) {
		this.zonaHoraria = zonaHoraria;
	}

	public OffsetDateTime getFecAlta() {
		return fecAlta;
	}

	public void setFecAlta(OffsetDateTime fecAlta) {
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

}










