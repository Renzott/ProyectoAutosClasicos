package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.CotizarAutoDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.CotizarAutoDAO;

public class CotizarAutoService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	CotizarAutoDAO dao = f.getCotizarAutoDAO();
	
	
	
	public int RegistrarCotizarAuto(CotizarAutoDTO cot) {
		
		return dao.RegistrarCotizarAuto(cot);
	}
	
	
	public int ActualizarCotizarAuto(CotizarAutoDTO cot) {
		
		return dao.ActualizarCotizarAuto(cot);
	}
	
	
	public int EliminarCotizarAuto(CotizarAutoDTO cot) {
		
		return dao.EliminarCotizarAuto(cot);
	}
	
	
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutos(){
		
		return dao.ListadoCotizarAutos();
	}
	
	
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutosPorCodigoMarcaAuto(String CodMarcaAuto){
		
		return dao.ListadoCotizarAutosPorCodigoMarcaAuto(CodMarcaAuto);
	}
	
	
	public ArrayList<CotizarAutoDTO> ListadoCotizarAutosPorCodigoAuto(String CodAuto){
		
		return dao.ListadoCotizarAutosPorCodigoAuto(CodAuto);
	}
	
	
	

}
