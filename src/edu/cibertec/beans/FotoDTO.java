package edu.cibertec.beans;

import java.io.Serializable;

public class FotoDTO implements Serializable{
	
	
	private String CodigoFoto;
	private String NombreFoto;
	
	
	public FotoDTO() {}


	public FotoDTO(String codigoFoto, String nombreFoto) {
		super();
		CodigoFoto = codigoFoto;
		NombreFoto = nombreFoto;
	}




	public String getCodigoFoto() {
		return CodigoFoto;
	}
	public void setCodigoFoto(String codigoFoto) {
		CodigoFoto = codigoFoto;
	}


	public String getNombreFoto() {
		return NombreFoto;
	}
	public void setNombreFoto(String nombreFoto) {
		NombreFoto = nombreFoto;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
