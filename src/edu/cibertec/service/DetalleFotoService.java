package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.DetalleFotoDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.DetalleFotoDAO;

public class DetalleFotoService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	DetalleFotoDAO dao = f.getDetalleFotoDAO();
	
	
	
	
	public ArrayList<DetalleFotoDTO> ListadoDetalleFoto(){
		
		return dao.ListadoDetalleFoto();
	}
	
	
	
	public ArrayList<DetalleFotoDTO> ListadoDetalleFotoPorCodigoFoto(String CodFoto){
		
		return dao.ListadoDetalleFotoPorCodigoFoto(CodFoto);
	}
	
	

}
