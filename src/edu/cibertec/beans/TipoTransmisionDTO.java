package edu.cibertec.beans;

import java.io.Serializable;
import java.util.List;

public class TipoTransmisionDTO implements Serializable{
	
	private String CodigoTipoTransmision;
	private String NombreTipoTransmision;
	
	public TipoTransmisionDTO() {}

	public TipoTransmisionDTO(String codigoTipoTransmision, String nombreTipoTransmision) {
		super();
		CodigoTipoTransmision = codigoTipoTransmision;
		NombreTipoTransmision = nombreTipoTransmision;
	}

	public String getCodigoTipoTransmision() {
		return CodigoTipoTransmision;
	}
	public void setCodigoTipoTransmision(String codigoTipoTransmision) {
		CodigoTipoTransmision = codigoTipoTransmision;
	}

	public String getNombreTipoTransmision() {
		return NombreTipoTransmision;
	}
	public void setNombreTipoTransmision(String nombreTipoTransmision) {
		NombreTipoTransmision = nombreTipoTransmision;
	}
}
