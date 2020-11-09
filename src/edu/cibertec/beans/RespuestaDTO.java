package edu.cibertec.beans;

import java.io.Serializable;
import java.util.List;

public class RespuestaDTO implements Serializable{
	
	private List<AutoDTO> lstAutos;
		
	public RespuestaDTO(){
		
	}

	public RespuestaDTO(List<AutoDTO> lstAutos) {
		super();
		this.lstAutos = lstAutos;
	}

	public List<AutoDTO> getLstAutos() {
		return lstAutos;
	}
	public void setLstAutos(List<AutoDTO> lstAutos) {
		this.lstAutos = lstAutos;
	}
}
