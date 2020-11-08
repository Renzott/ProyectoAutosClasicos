package edu.cibertec.interfaces;

import java.util.ArrayList;

import edu.cibertec.beans.ClienteDTO;

public interface ClienteDAO {
	
	
	public int RegistrarCliente(ClienteDTO clie);
	
	public int ActualizarCliente(ClienteDTO clie);
	
	public int EliminarCliente(ClienteDTO clie);
	
	
	public ArrayList<ClienteDTO> ListadoClientes();
	
	public ArrayList<ClienteDTO> ListadoClientesPorCodigoAuto(String CodAuto);
	

}
