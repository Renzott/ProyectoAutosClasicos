package edu.cibertec.beans;

import java.io.Serializable;

public class DetalleClienteAutoFacturaDTO implements Serializable{
	
	
	private String CodigoAuto;
	private int CodigoCliente;
	private int NroFactura;
	private double PrecioVentaDetalleClienteAutoFactura;
	
	
	
	public DetalleClienteAutoFacturaDTO() {}
	
	
	public DetalleClienteAutoFacturaDTO(String codigoAuto, int codigoCliente, int nroFactura,
			double precioVentaDetalleClienteAutoFactura) {
		super();
		CodigoAuto = codigoAuto;
		CodigoCliente = codigoCliente;
		NroFactura = nroFactura;
		PrecioVentaDetalleClienteAutoFactura = precioVentaDetalleClienteAutoFactura;
	}





	public String getCodigoAuto() {
		return CodigoAuto;
	}
	public void setCodigoAuto(String codigoAuto) {
		CodigoAuto = codigoAuto;
	}
	
	
	public int getCodigoCliente() {
		return CodigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		CodigoCliente = codigoCliente;
	}
	
	
	public int getNroFactura() {
		return NroFactura;
	}
	public void setNroFactura(int nroFactura) {
		NroFactura = nroFactura;
	}
	
	
	public double getPrecioVentaDetalleClienteAutoFactura() {
		return PrecioVentaDetalleClienteAutoFactura;
	}
	public void setPrecioVentaDetalleClienteAutoFactura(double precioVentaDetalleClienteAutoFactura) {
		PrecioVentaDetalleClienteAutoFactura = precioVentaDetalleClienteAutoFactura;
	}
	
	
	
	
	
	
	
	

}
