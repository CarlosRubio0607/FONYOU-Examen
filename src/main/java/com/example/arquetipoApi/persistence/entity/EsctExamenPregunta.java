package com.example.arquetipoApi.persistence.entity;

import java.time.OffsetDateTime;
import java.util.Date;

import jakarta.persistence.CascadeType;
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
@Table(name = "esct_examen_pregunta")
public class EsctExamenPregunta {

    @Id
    @Column(name = "CVE_PREGUNTA", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cvePregunta;

    @Column(name = "PREGUNTA", nullable = false, length = 100)
    private String pregunta;

    @Column(name = "OPS_UNO", nullable = false, length = 100)
    private String opsUno;

    @Column(name = "OPS_DOS", nullable = false, length = 100)
    private String opsDos;

    @Column(name = "OPS_TRES", nullable = false, length = 100)
    private String opsTres;

    @Column(name = "OPS_CUATRO", nullable = false, length = 100)
    private String opsCuatro;

    @Column(name = "OPS_CORRECTA", nullable = false, length = 100)
    private String opsCorrecta;

    @Column(name = "FEC_ALTA", nullable = false)
    private Date fecAlta;

    @Column (name = "FEC_BAJA" )
    private OffsetDateTime fecBaja;

    @Column (name = "FEC_MODIFICA" )
    private OffsetDateTime fecModifica;

    @Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Column(name = "CVE_USUARIO_BAJA", length = 60)
    private String cveUsuarioBaja;

    @Column(name = "CVE_USUARIO_MODIFICA", length = 60)
    private String cveUsuarioModifica;

    @ManyToOne
    @JoinColumn(name = "cve_examen", nullable = false)
    private EsctExamen cveExamen;

	public Integer getCvePregunta() {
		return cvePregunta;
	}

	public void setCvePregunta(Integer cvePregunta) {
		this.cvePregunta = cvePregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getOpsUno() {
		return opsUno;
	}

	public void setOpsUno(String opsUno) {
		this.opsUno = opsUno;
	}

	public String getOpsDos() {
		return opsDos;
	}

	public void setOpsDos(String opsDos) {
		this.opsDos = opsDos;
	}

	public String getOpsTres() {
		return opsTres;
	}

	public void setOpsTres(String opsTres) {
		this.opsTres = opsTres;
	}

	public String getOpsCuatro() {
		return opsCuatro;
	}

	public void setOpsCuatro(String opsCuatro) {
		this.opsCuatro = opsCuatro;
	}

	public String getOpsCorrecta() {
		return opsCorrecta;
	}

	public void setOpsCorrecta(String opsCorrecta) {
		this.opsCorrecta = opsCorrecta;
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

	public EsctExamen getCveExamen() {
		return cveExamen;
	}

	public void setCveExamen(EsctExamen cveExamen) {
		this.cveExamen = cveExamen;
	}


}
