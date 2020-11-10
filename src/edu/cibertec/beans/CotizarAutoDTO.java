package edu.cibertec.beans;

import java.io.Serializable;

public class CotizarAutoDTO implements Serializable{
	
	
	private int CodigoCotizarAuto;
	private String NroDocumentoCotizarAuto;
	private String NombresCotizarAuto;
	private String ApellidosCotizarAuto;
	private String CorreoCotizarAuto;
	private double SumaAseguradoraDolarCotizarAuto;
	private int TelefonoCotizarAuto;
	private String CodigoMarcaAuto;
	private String CodigoAuto;
	
	
	
	public CotizarAutoDTO() {}
	
	
	public CotizarAutoDTO(int codigoCotizarAuto, String nroDocumentoCotizarAuto, String nombresCotizarAuto,
			String apellidosCotizarAuto, String correoCotizarAuto, double sumaAseguradoraDolarCotizarAuto,
			int telefonoCotizarAuto, String codigoMarcaAuto, String codigoAuto) {
		super();
		CodigoCotizarAuto = codigoCotizarAuto;
		NroDocumentoCotizarAuto = nroDocumentoCotizarAuto;
		NombresCotizarAuto = nombresCotizarAuto;
		ApellidosCotizarAuto = apellidosCotizarAuto;
		CorreoCotizarAuto = correoCotizarAuto;
		SumaAseguradoraDolarCotizarAuto = sumaAseguradoraDolarCotizarAuto;
		TelefonoCotizarAuto = telefonoCotizarAuto;
		CodigoMarcaAuto = codigoMarcaAuto;
		CodigoAuto = codigoAuto;
	}





	public int getCodigoCotizarAuto() {
		return CodigoCotizarAuto;
	}
	public void setCodigoCotizarAuto(int codigoCotizarAuto) {
		CodigoCotizarAuto = codigoCotizarAuto;
	}
	
	
	public String getNroDocumentoCotizarAuto() {
		return NroDocumentoCotizarAuto;
	}
	public void setNroDocumentoCotizarAuto(String nroDocumentoCotizarAuto) {
		NroDocumentoCotizarAuto = nroDocumentoCotizarAuto;
	}
	
	
	public String getNombresCotizarAuto() {
		return NombresCotizarAuto;
	}
	public void setNombresCotizarAuto(String nombresCotizarAuto) {
		NombresCotizarAuto = nombresCotizarAuto;
	}
	
	
	public String getApellidosCotizarAuto() {
		return ApellidosCotizarAuto;
	}
	public void setApellidosCotizarAuto(String apellidosCotizarAuto) {
		ApellidosCotizarAuto = apellidosCotizarAuto;
	}
	
	
	public String getCorreoCotizarAuto() {
		return CorreoCotizarAuto;
	}
	public void setCorreoCotizarAuto(String correoCotizarAuto) {
		CorreoCotizarAuto = correoCotizarAuto;
	}
	
	
	public double getSumaAseguradoraDolarCotizarAuto() {
		return SumaAseguradoraDolarCotizarAuto;
	}
	public void setSumaAseguradoraDolarCotizarAuto(double sumaAseguradoraDolarCotizarAuto) {
		SumaAseguradoraDolarCotizarAuto = sumaAseguradoraDolarCotizarAuto;
	}
	
	
	public int getTelefonoCotizarAuto() {
		return TelefonoCotizarAuto;
	}
	public void setTelefonoCotizarAuto(int telefonoCotizarAuto) {
		TelefonoCotizarAuto = telefonoCotizarAuto;
	}
	
	
	public String getCodigoMarcaAuto() {
		return CodigoMarcaAuto;
	}
	public void setCodigoMarcaAuto(String codigoMarcaAuto) {
		CodigoMarcaAuto = codigoMarcaAuto;
	}
	
	
	public String getCodigoAuto() {
		return CodigoAuto;
	}
	public void setCodigoAuto(String codigoAuto) {
		CodigoAuto = codigoAuto;
	}

}
