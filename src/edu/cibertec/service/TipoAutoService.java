package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.TipoAutoDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.TipoAutoDAO;

public class TipoAutoService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	TipoAutoDAO dao = f.getTipoAutoDAO();
	
	
	
	public ArrayList<TipoAutoDTO> ListadoTipoAuto(){
		
		return dao.ListadoTipoAuto();
	}

	/*----------------------Alvaro------------------------*/

	public TipoAutoDTO ListadoTipoAutoxCodigo(String codigo){
		
		return dao.ListadoTipoAutoxCodigo(codigo);
	}
}
