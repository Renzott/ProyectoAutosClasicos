package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.TipoTransmisionDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.TipoTransmisionDAO;

public class TipoTransmisionService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	TipoTransmisionDAO dao = f.getTipoTransmisionDAO();
	
	
	
	public ArrayList<TipoTransmisionDTO> ListadoTipoTransmision(){
		
		return dao.ListadoTipoTransmision();
	}

	/*----------------------Alvaro------------------------*/
	
	public TipoTransmisionDTO ListadoTipoTransmisionxCodigo(String codigo){
		
		return dao.ListadoTipoTransmisionxCodigo(codigo);
	}
}
