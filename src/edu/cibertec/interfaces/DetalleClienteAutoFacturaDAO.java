package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.DetalleClienteAutoFacturaDTO;


public interface DetalleClienteAutoFacturaDAO {
	
	
	public int RegistrarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det);
	
	public int ActualizarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det);
	
	public int EliminarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det);
	
	
	public ArrayList<DetalleClienteAutoFacturaDTO> ListadoDetalleClienteAutoFactura();
	
	

}
