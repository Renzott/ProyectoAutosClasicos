package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.AutoDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.AutoDAO;

public class AutoService {
	
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	AutoDAO dao = f.getAutoDAO();
	
	
	
	public ArrayList<AutoDTO> ListadoAuto(){
		
		return dao.ListadoAuto();
	}

	public AutoDTO ListadoAutoPorCodigo(String codigo){
		
		return dao.ListadoAutoPorCodigo(codigo);
	}
	
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoTipoAuto(String CodTipoAuto){
		
		return dao.ListadoAutoPorCodigoTipoAuto(CodTipoAuto);
	}
	
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoMarcaAuto(String CodMarcaAuto){
		
		return dao.ListadoAutoPorCodigoMarcaAuto(CodMarcaAuto);
	}
	
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoCarroceria(String CodCarroceria){
		
		return dao.ListadoAutoPorCodigoCarroceria(CodCarroceria);
	}
	
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoTipoTransmision(String CodTipoTransmision){
		
		return dao.ListadoAutoPorCodigoTipoTransmision(CodTipoTransmision);
	}
	
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoCombustible(String CodCombustible){
		
		return dao.ListadoAutoPorCodigoCombustible(CodCombustible);
	}
	
	
	public ArrayList<AutoDTO> ListadoAutoPorCodigoKilometraje(String CodKilometraje){
		
		return dao.ListadoAutoPorCodigoKilometraje(CodKilometraje);
	}
	

}
