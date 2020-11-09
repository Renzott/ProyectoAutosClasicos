package edu.cibertec.beans;

import java.io.Serializable;
import java.util.List;

public class KilometrajeDTO implements Serializable{
	
	private String CodigoKilometraje;
	private String NombreKilometraje;
	
	public KilometrajeDTO() {}

	public KilometrajeDTO(String codigoKilometraje, String nombreKilometraje) {
		super();
		CodigoKilometraje = codigoKilometraje;
		NombreKilometraje = nombreKilometraje;
	}

	public String getCodigoKilometraje() {
		return CodigoKilometraje;
	}
	public void setCodigoKilometraje(String codigoKilometraje) {
		CodigoKilometraje = codigoKilometraje;
	}

	public String getNombreKilometraje() {
		return NombreKilometraje;
	}
	public void setNombreKilometraje(String nombreKilometraje) {
		NombreKilometraje = nombreKilometraje;
	}
}
