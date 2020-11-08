package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.UsuarioEventoDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.UsuarioEventoDAO;

public class UsuarioEventoService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	UsuarioEventoDAO dao = f.getUsuarioEventoDAO();
	
	
	
	public int RegistrarUsuarioEvento(UsuarioEventoDTO ue) {
		
		return dao.RegistrarUsuarioEvento(ue);
	}
	
	
	public int ActualizarUsuarioEvento(UsuarioEventoDTO ue) {
		
		return dao.ActualizarUsuarioEvento(ue);
	}
	
	
	public int EliminarUsuarioEvento(UsuarioEventoDTO ue) {
		
		return dao.EliminarUsuarioEvento(ue);
	}
	
	
	public ArrayList<UsuarioEventoDTO> ListadoUsuarioEvento(){
		
		return dao.ListadoUsuarioEvento();
	}
	
	
	public ArrayList<UsuarioEventoDTO> ListadoUsuarioEventoPorCodigoEvento(String CodEventos){
		
		return dao.ListadoUsuarioEventoPorCodigoEvento(CodEventos);
	}
	

}
