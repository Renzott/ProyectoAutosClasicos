package edu.cibertec.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.ClienteDTO;
import edu.cibertec.service.ClienteService;

@Path("/tipopost")
public class ServiciosPost {

	//http://localhost:8080/ProyectoAutosClasicos/tipopost/registrocliente
		
	@POST
	@Path("/registrocliente")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String registrarCliente(ClienteDTO datos){
		System.out.println("ini: registrarCliente()");
		String respuesta;
		
		ClienteService clienteService = new ClienteService();
		int registro = clienteService.RegistrarCliente(datos);
		
		if (registro == 1) {
			System.out.println("Registro de Cliente Exitoso");
			respuesta = "Registro de Cliente Exitoso";
		} else {
			System.out.println("Registro de Cliente Fallido");
			respuesta = "Registro de Cliente Fallido";
		}
		
		System.out.println("fin: registrarCliente()");		
		return respuesta;
	}
}
