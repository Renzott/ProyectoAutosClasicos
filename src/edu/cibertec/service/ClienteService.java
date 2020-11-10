package edu.cibertec.service;

import java.util.ArrayList;

import edu.cibertec.beans.ClienteDTO;
import edu.cibertec.dao.DAOFactory;
import edu.cibertec.interfaces.ClienteDAO;

public class ClienteService {
	
	
	DAOFactory f = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	ClienteDAO dao = f.getClienteDAO();
	
	
	
	public int RegistrarCliente(ClienteDTO clie) {
		
		return dao.RegistrarCliente(clie);
	}
	
	
	public int ActualizarCliente(ClienteDTO clie) {
		
		return dao.ActualizarCliente(clie);
	}
	
	
	public int EliminarCliente(ClienteDTO clie) {
		
		return dao.EliminarCliente(clie);
	}
	
	
	public ArrayList<ClienteDTO> ListadoClientes(){
		
		return dao.ListadoClientes();
	}
	
	
	public ArrayList<ClienteDTO> ListadoClientesPorCodigoAuto(String CodAuto){
		
		return dao.ListadoClientesPorCodigoAuto(CodAuto);
	}

}
