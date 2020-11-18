package edu.cibertec.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.ClienteDTO;
import edu.cibertec.service.ClienteService;

@Path("/api")
public class UsuarioController {
		
	@POST
	@Path("/usuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String registrarCliente(ClienteDTO datos){

		String respuesta;
		
		ClienteService clienteService = new ClienteService();
		int registro = clienteService.RegistrarCliente(datos);
		
		if (registro == 1) {
			respuesta = "Registro de Cliente Exitoso";
		} else {
			respuesta = "Registro de Cliente Fallido";
		}

		return respuesta;
	}
}
