package edu.cibertec.interfaces;


import java.util.ArrayList;
import edu.cibertec.beans.FacturaDTO;

public interface FacturaDAO {
	
	
	public int RegistrarFactura(FacturaDTO fac);
	
	public int ActualizarFactura(FacturaDTO fac);
	
	public int EliminarFactura(FacturaDTO fac);
	
	
	
	public ArrayList<FacturaDTO> ListadoFactura();
	
	
	
	

}
