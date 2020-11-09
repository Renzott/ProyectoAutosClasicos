package edu.cibertec.beans;

import java.io.Serializable;
import java.util.List;

public class CombustibleDTO implements Serializable{
	
	private String CodigoCombustible;
	private String NombreCombustible;
	
	public CombustibleDTO() {}

	public CombustibleDTO(String codigoCombustible, String nombreCombustible) {
		super();
		CodigoCombustible = codigoCombustible;
		NombreCombustible = nombreCombustible;
	}

	public String getCodigoCombustible() {
		return CodigoCombustible;
	}
	public void setCodigoCombustible(String codigoCombustible) {
		CodigoCombustible = codigoCombustible;
	}

	public String getNombreCombustible() {
		return NombreCombustible;
	}
	public void setNombreCombustible(String nombreCombustible) {
		NombreCombustible = nombreCombustible;
	}
}
