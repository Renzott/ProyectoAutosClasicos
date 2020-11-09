package edu.cibertec.beans;

import java.io.Serializable;
import java.util.List;

public class MarcaAutoDTO implements Serializable{
	
	private String CodigoMarcaAuto;
	private String NombreMarcaAuto;
	
	public MarcaAutoDTO() {}
	
	public MarcaAutoDTO(String codigoMarcaAuto, String nombreMarcaAuto) {
		super();
		CodigoMarcaAuto = codigoMarcaAuto;
		NombreMarcaAuto = nombreMarcaAuto;
	}

	public String getCodigoMarcaAuto() {
		return CodigoMarcaAuto;
	}
	public void setCodigoMarcaAuto(String codigoMarcaAuto) {
		CodigoMarcaAuto = codigoMarcaAuto;
	}

	public String getNombreMarcaAuto() {
		return NombreMarcaAuto;
	}
	public void setNombreMarcaAuto(String nombreMarcaAuto) {
		NombreMarcaAuto = nombreMarcaAuto;
	}
}
