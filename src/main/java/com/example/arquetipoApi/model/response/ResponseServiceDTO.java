package com.example.arquetipoApi.model.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseServiceDTO implements Serializable {
	
	private static final long serialVersionUID = 6199727158451188243L;
	
	private String mensaje;
	private Object respuesta;
	private Boolean estatus;
	private int code;
	private String respuestaPersonalizada;
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Object getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(Object respuesta) {
		this.respuesta = respuesta;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getRespuestaPersonalizada() {
		return respuestaPersonalizada;
	}
	public void setRespuestaPersonalizada(String respuestaPersonalizada) {
		this.respuestaPersonalizada = respuestaPersonalizada;
	}
	
	
}
