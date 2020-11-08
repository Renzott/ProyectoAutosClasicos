package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.FotoDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.FotoDAO;

public class FotosService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	FotoDAO dao =  f.getFotoDAO();
	
	
	
	public ArrayList<FotoDTO> ListadoFoto(){
		
		return dao.ListadoFoto();
	}

}
