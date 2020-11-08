package edu.cibertec.beans;

import java.io.Serializable;

public class EventosDTO implements Serializable{
	
	
	private String CodigoEventos;
	private String TituloEventos;
	private String FechaEventos;
	private String FotoEventos;
	private String CodigoAuto;
	
	
	public EventosDTO() {}
	
	
	public EventosDTO(String codigoEventos, String tituloEventos, String fechaEventos, String fotoEventos,
			String codigoAuto) {
		super();
		CodigoEventos = codigoEventos;
		TituloEventos = tituloEventos;
		FechaEventos = fechaEventos;
		FotoEventos = fotoEventos;
		CodigoAuto = codigoAuto;
	}





	public String getCodigoEventos() {
		return CodigoEventos;
	}
	public void setCodigoEventos(String codigoEventos) {
		CodigoEventos = codigoEventos;
	}
	
	
	public String getTituloEventos() {
		return TituloEventos;
	}
	public void setTituloEventos(String tituloEventos) {
		TituloEventos = tituloEventos;
	}
	
	
	public String getFechaEventos() {
		return FechaEventos;
	}
	public void setFechaEventos(String fechaEventos) {
		FechaEventos = fechaEventos;
	}
	
	
	public String getFotoEventos() {
		return FotoEventos;
	}
	public void setFotoEventos(String fotoEventos) {
		FotoEventos = fotoEventos;
	}
	
	
	public String getCodigoAuto() {
		return CodigoAuto;
	}
	public void setCodigoAuto(String codigoAuto) {
		CodigoAuto = codigoAuto;
	}
	
	
	
	
	
	
		

}
