package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.DetalleClienteAutoFacturaDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.DetalleClienteAutoFacturaDAO;

public class DetalleClienteAutoFacturaService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	DetalleClienteAutoFacturaDAO dao = f.getDetalleClienteAutoFacturaDAO();
	
	
	
	public int RegistrarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det) {
		
		return dao.RegistrarDetalleClienteAutoFactura(det);
	}
	
	
	public int ActualizarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det) {
		
		return dao.ActualizarDetalleClienteAutoFactura(det);
	}
	
	
	public int EliminarDetalleClienteAutoFactura(DetalleClienteAutoFacturaDTO det) {
		
		return dao.EliminarDetalleClienteAutoFactura(det);
	}
	
	
	public ArrayList<DetalleClienteAutoFacturaDTO> ListadoDetalleClienteAutoFactura(){
		
		return dao.ListadoDetalleClienteAutoFactura();
	}
	

}
