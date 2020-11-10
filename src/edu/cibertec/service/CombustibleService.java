package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.CombustibleDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.CombustibleDAO;

public class CombustibleService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	CombustibleDAO dao = f.getCombustibleDAO();
	
	
	public ArrayList<CombustibleDTO> ListadoCombustible(){
		
		return dao.ListadoCombustible();
	}

	/*----------------------Alvaro------------------------*/

	public CombustibleDTO ListadoCombustiblexCodigo(String codigo){
		
		return dao.ListadoCombustiblexCodigo(codigo);
	}
}
