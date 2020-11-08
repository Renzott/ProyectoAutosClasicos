package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.EventosDTO;

public interface EventosDAO {
	
	
	public int RegistrarEventos(EventosDTO eve);
	
	public int ActualizarEventos(EventosDTO eve);
	
	public int EliminarEventos(EventosDTO eve);
	
	
	
	public ArrayList<EventosDTO> ListadoEventos();
	
	public ArrayList<EventosDTO> ListadoEventosPorCodigoAuto(String CodAuto);
	
	
	
	

}
