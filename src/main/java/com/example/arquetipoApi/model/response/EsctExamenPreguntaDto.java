package com.example.arquetipoApi.model.response;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class EsctExamenPreguntaDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer cvePregunta;
	private String pregunta;
	private String opsUno;
	private String opsDos;
	private String opsTres;
	private String opsCuatro;
	private String opsCorrecta;
	private Date fecAlta;
	private OffsetDateTime fecBaja;
	private OffsetDateTime fecModifica;
	private String cveUsuarioAlta;
	private String cveUsuarioBaja;
	private String cveUsuarioModifica;
	
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

	
}
