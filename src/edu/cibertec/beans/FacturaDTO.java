package edu.cibertec.beans;

import java.io.Serializable;

public class FacturaDTO implements Serializable{
	
	
	private int NroFactura;
	private String FechaFactura;
	
	
	
	public FacturaDTO(){}
	
	

	public FacturaDTO(int nroFactura, String fechaFactura) {
		super();
		NroFactura = nroFactura;
		FechaFactura = fechaFactura;
	}




	public int getNroFactura() {
		return NroFactura;
	}
	public void setNroFactura(int nroFactura) {
		NroFactura = nroFactura;
	}
	
	
	public String getFechaFactura() {
		return FechaFactura;
	}
	public void setFechaFactura(String fechaFactura) {
		FechaFactura = fechaFactura;
	}
	
	
	
	
	
	

}
