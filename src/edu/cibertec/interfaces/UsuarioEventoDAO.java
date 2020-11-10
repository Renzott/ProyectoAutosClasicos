package edu.cibertec.interfaces;

import java.util.ArrayList;


import edu.cibertec.beans.UsuarioEventoDTO;

public interface UsuarioEventoDAO {
	
	
	public int RegistrarUsuarioEvento(UsuarioEventoDTO ue);
	
	public int ActualizarUsuarioEvento(UsuarioEventoDTO ue);
	
	public int EliminarUsuarioEvento(UsuarioEventoDTO ue);
	
	
	
	public ArrayList<UsuarioEventoDTO> ListadoUsuarioEvento();
	
	public ArrayList<UsuarioEventoDTO> ListadoUsuarioEventoPorCodigoEvento(String CodEventos);
	
	
	

}
