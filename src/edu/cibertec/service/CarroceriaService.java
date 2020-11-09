package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.CarroceriaDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.CarroceriaDAO;

public class CarroceriaService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	CarroceriaDAO dao = f.getCarroceriaDAO();
	
	
	public ArrayList<CarroceriaDTO> ListadoCarroceria(){
		
		return dao.ListadoCarroceria();
	}

	/*----------------------Alvaro------------------------*/
	
	public CarroceriaDTO ListadoCarroceriaxCodigo(String codigo){
		
		return dao.ListadoCarroceriaxCodigo(codigo);
	}
	

}
