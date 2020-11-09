package edu.cibertec.beans;

import java.io.Serializable;
import java.util.List;

public class CarroceriaDTO implements Serializable{
	
	private String CodigoCarroceria;
	private String NombreCarroceria;

	public CarroceriaDTO() {}
	
	public CarroceriaDTO(String codigoCarroceria, String nombreCarroceria) {
		super();
		CodigoCarroceria = codigoCarroceria;
		NombreCarroceria = nombreCarroceria;
	}
	
	public String getCodigoCarroceria() {
		return CodigoCarroceria;
	}
	public void setCodigoCarroceria(String codigoCarroceria) {
		CodigoCarroceria = codigoCarroceria;
	}

	public String getNombreCarroceria() {
		return NombreCarroceria;
	}
	public void setNombreCarroceria(String nombreCarroceria) {
		NombreCarroceria = nombreCarroceria;
	}
}
