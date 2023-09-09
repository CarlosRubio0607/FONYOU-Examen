package com.example.arquetipoApi.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntencionalException extends Exception{

	private static final long serialVersionUID = 3088432090693089273L;

	private String codeMessage;
	private Integer statusServer;
	
	public IntencionalException(String message) {
		super(message);
	}

	public IntencionalException(String message, String codeMessage) {
		super(message);
		this.codeMessage = codeMessage;
	}
	
	public IntencionalException(String message, String codeMessage, Integer statusServer) {
		super(message);
		this.codeMessage = codeMessage;
		this.statusServer = statusServer;
	}

	public String getCodeMessage() {
		return codeMessage;
	}

	public void setCodeMessage(String codeMessage) {
		this.codeMessage = codeMessage;
	}

	public Integer getStatusServer() {
		return statusServer;
	}

	public void setStatusServer(Integer statusServer) {
		this.statusServer = statusServer;
	}
	
	
}
