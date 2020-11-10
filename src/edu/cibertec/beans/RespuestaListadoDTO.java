package edu.cibertec.beans;


import java.io.Serializable;
import java.util.List;

public class RespuestaListadoDTO implements Serializable {
	
	private Object response;

	public RespuestaListadoDTO(Object response) {
		this.response = response;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}
}
