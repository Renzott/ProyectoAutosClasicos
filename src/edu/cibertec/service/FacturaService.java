package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.FacturaDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.FacturaDAO;

public class FacturaService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	FacturaDAO dao = f.getFacturaDAO();
	
	
	
	public int RegistrarFactura(FacturaDTO fac) {
		
		return dao.RegistrarFactura(fac);
	}
	
	
	public int ActualizarFactura(FacturaDTO fac) {
		
		return dao.ActualizarFactura(fac);
	}
	
	
	public int EliminarFactura(FacturaDTO fac) {
		
		return dao.EliminarFactura(fac);
	}
	
	
	
	public ArrayList<FacturaDTO> ListadoFactura(){
		
		return dao.ListadoFactura();
	}
	
	

}
