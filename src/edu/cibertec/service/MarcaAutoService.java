package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.MarcaAutoDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.MarcaAutoDAO;

public class MarcaAutoService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	MarcaAutoDAO dao = f.getMarcaAutoDAO();
	
	
	
	public ArrayList<MarcaAutoDTO> ListadoMarcaAuto(){
		
		return dao.ListadoMarcaAuto();
	}

	/*----------------------Alvaro------------------------*/
	
	public MarcaAutoDTO ListadoMarcaAutoxCodigo(String codigo){
		
		return dao.ListadoMarcaAutoxCodigo(codigo);
	}
}
