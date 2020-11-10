package edu.cibertec.beans;

import java.io.Serializable;

public class UsuarioEventoDTO implements Serializable{
	
	
	
	private int CodigoUsuarioEvento;
	private String NroDocumentoUsuarioEvento;
	private String NombresUsuarioEvento;
	private String ApellidosUsuarioEvento;
	private String FechaNacimientoUsuarioEvento;
	private String CorreoUsuarioEvento;
	private String CodigoEventos;
	
	

	public UsuarioEventoDTO() {}
	
	
	
	
	public UsuarioEventoDTO(int codigoUsuarioEvento, String nroDocumentoUsuarioEvento, String nombresUsuarioEvento,
			String apellidosUsuarioEvento, String fechaNacimientoUsuarioEvento, String correoUsuarioEvento,
			String codigoEventos) {
		super();
		CodigoUsuarioEvento = codigoUsuarioEvento;
		NroDocumentoUsuarioEvento = nroDocumentoUsuarioEvento;
		NombresUsuarioEvento = nombresUsuarioEvento;
		ApellidosUsuarioEvento = apellidosUsuarioEvento;
		FechaNacimientoUsuarioEvento = fechaNacimientoUsuarioEvento;
		CorreoUsuarioEvento = correoUsuarioEvento;
		CodigoEventos = codigoEventos;
	}




	public int getCodigoUsuarioEvento() {
		return CodigoUsuarioEvento;
	}
	public void setCodigoUsuarioEvento(int codigoUsuarioEvento) {
		CodigoUsuarioEvento = codigoUsuarioEvento;
	}
	
	
	public String getNroDocumentoUsuarioEvento() {
		return NroDocumentoUsuarioEvento;
	}
	public void setNroDocumentoUsuarioEvento(String nroDocumentoUsuarioEvento) {
		NroDocumentoUsuarioEvento = nroDocumentoUsuarioEvento;
	}
	
	
	public String getNombresUsuarioEvento() {
		return NombresUsuarioEvento;
	}
	public void setNombresUsuarioEvento(String nombresUsuarioEvento) {
		NombresUsuarioEvento = nombresUsuarioEvento;
	}
	
	
	public String getApellidosUsuarioEvento() {
		return ApellidosUsuarioEvento;
	}
	public void setApellidosUsuarioEvento(String apellidosUsuarioEvento) {
		ApellidosUsuarioEvento = apellidosUsuarioEvento;
	}
	
	
	public String getFechaNacimientoUsuarioEvento() {
		return FechaNacimientoUsuarioEvento;
	}
	public void setFechaNacimientoUsuarioEvento(String fechaNacimientoUsuarioEvento) {
		FechaNacimientoUsuarioEvento = fechaNacimientoUsuarioEvento;
	}
	
	
	public String getCorreoUsuarioEvento() {
		return CorreoUsuarioEvento;
	}
	public void setCorreoUsuarioEvento(String correoUsuarioEvento) {
		CorreoUsuarioEvento = correoUsuarioEvento;
	}
	
	
	public String getCodigoEventos() {
		return CodigoEventos;
	}
	public void setCodigoEventos(String codigoEventos) {
		CodigoEventos = codigoEventos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
