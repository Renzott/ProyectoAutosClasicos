package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.KilometrajeDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.KilometrajeDAO;

public class KilometrajeService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	KilometrajeDAO dao = f.getKilometrajeDAO();
	
	
	public ArrayList<KilometrajeDTO> ListadoKilometraje(){
		
		return dao.ListadoKilometraje();
	}

}
