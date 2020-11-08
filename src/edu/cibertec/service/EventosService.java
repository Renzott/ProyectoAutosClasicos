package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.EventosDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.EventosDAO;

public class EventosService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	EventosDAO dao = f.getEventosDAO();
	
	
	
	public int RegistrarEventos(EventosDTO eve) {
		
		return dao.RegistrarEventos(eve);
	}
	
	
	public int ActualizarEventos(EventosDTO eve) {
		
		return dao.ActualizarEventos(eve);
	}
	
	
	public int EliminarEventos(EventosDTO eve) {
		
		return dao.EliminarEventos(eve);
	}
	
	
	public ArrayList<EventosDTO> ListadoEventos(){
		
		return dao.ListadoEventos();
	}
	
	
	public ArrayList<EventosDTO> ListadoEventosPorCodigoAuto(String CodAuto){
		
		return dao.ListadoEventosPorCodigoAuto(CodAuto);
	}
	
	

}
