package edu.cibertec.beans;

import java.io.Serializable;

public class ClienteDTO implements Serializable{
	
	private int CodigoCliente;
	private String NroDocumentoCliente;
	private String NombresCliente;
	private String ApellidosCliente;
	private String FechaNacimientoCliente;
	private String CorreoCliente;
	private String ContrasenaCliente;
	private int TelefonoCliente;
	private String CodigoAuto;
	
	public ClienteDTO() {
		
	}
	
	public ClienteDTO(int codigoCliente, String nroDocumentoCliente, String nombresCliente, String apellidosCliente,
			String fechaNacimientoCliente, String correoCliente, String contrasenaCliente, int telefonoCliente,
			String codigoAuto) {
		super();
		CodigoCliente = codigoCliente;
		NroDocumentoCliente = nroDocumentoCliente;
		NombresCliente = nombresCliente;
		ApellidosCliente = apellidosCliente;
		FechaNacimientoCliente = fechaNacimientoCliente;
		CorreoCliente = correoCliente;
		ContrasenaCliente = contrasenaCliente;
		TelefonoCliente = telefonoCliente;
		CodigoAuto = codigoAuto;
	}
	
	public int getCodigoCliente() {
		return CodigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		CodigoCliente = codigoCliente;
	}
	
	public String getNroDocumentoCliente() {
		return NroDocumentoCliente;
	}
	public void setNroDocumentoCliente(String nroDocumentoCliente) {
		NroDocumentoCliente = nroDocumentoCliente;
	}
	
	public String getNombresCliente() {
		return NombresCliente;
	}
	public void setNombresCliente(String nombresCliente) {
		NombresCliente = nombresCliente;
	}
	
	public String getApellidosCliente() {
		return ApellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		ApellidosCliente = apellidosCliente;
	}
	
	public String getFechaNacimientoCliente() {
		return FechaNacimientoCliente;
	}
	public void setFechaNacimientoCliente(String fechaNacimientoCliente) {
		FechaNacimientoCliente = fechaNacimientoCliente;
	}
	
	public String getCorreoCliente() {
		return CorreoCliente;
	}
	public void setCorreoCliente(String correoCliente) {
		CorreoCliente = correoCliente;
	}
	
	public String getContrasenaCliente() {
		return ContrasenaCliente;
	}
	public void setContrasenaCliente(String contrasenaCliente) {
		ContrasenaCliente = contrasenaCliente;
	}
	
	public int getTelefonoCliente() {
		return TelefonoCliente;
	}
	public void setTelefonoCliente(int telefonoCliente) {
		TelefonoCliente = telefonoCliente;
	}
	
	public String getCodigoAuto() {
		return CodigoAuto;
	}
	public void setCodigoAuto(String codigoAuto) {
		CodigoAuto = codigoAuto;
	}
}
