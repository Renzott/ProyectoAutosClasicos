package edu.cibertec.beans;

import java.io.Serializable;

public class DetalleFotoDTO implements Serializable{
	
	
	private String CodigoDetalleFoto;
	private String CodigoFoto;
	private String UrlDetalleFoto;
	
	
	public DetalleFotoDTO() {}
	
	
	public DetalleFotoDTO(String codigoDetalleFoto, String codigoFoto, String urlDetalleFoto) {
		super();
		CodigoDetalleFoto = codigoDetalleFoto;
		CodigoFoto = codigoFoto;
		UrlDetalleFoto = urlDetalleFoto;
	}




	public String getCodigoDetalleFoto() {
		return CodigoDetalleFoto;
	}
	public void setCodigoDetalleFoto(String codigoDetalleFoto) {
		CodigoDetalleFoto = codigoDetalleFoto;
	}
	
	
	public String getCodigoFoto() {
		return CodigoFoto;
	}
	public void setCodigoFoto(String codigoFoto) {
		CodigoFoto = codigoFoto;
	}
	
	
	public String getUrlDetalleFoto() {
		return UrlDetalleFoto;
	}
	public void setUrlDetalleFoto(String urlDetalleFoto) {
		UrlDetalleFoto = urlDetalleFoto;
	}
	
	
	
	
	
	
	
	

}
