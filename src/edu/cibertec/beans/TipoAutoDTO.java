package edu.cibertec.beans;

import java.io.Serializable;
import java.util.List;

public class TipoAutoDTO implements Serializable{
	
	private String CodigoTipoAuto;
	private String NombreTipoAuto;
	
	public TipoAutoDTO() {}
	
	public TipoAutoDTO(String codigoTipoAuto, String nombreTipoAuto) {
		super();
		CodigoTipoAuto = codigoTipoAuto;
		NombreTipoAuto = nombreTipoAuto;
	}

	public String getCodigoTipoAuto() {
		return CodigoTipoAuto;
	}
	public void setCodigoTipoAuto(String codigoTipoAuto) {
		CodigoTipoAuto = codigoTipoAuto;
	}
	
	public String getNombreTipoAuto() {
		return NombreTipoAuto;
	}
	public void setNombreTipoAuto(String nombreTipoAuto) {
		NombreTipoAuto = nombreTipoAuto;
	}
}
