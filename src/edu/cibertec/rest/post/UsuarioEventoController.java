package edu.cibertec.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.ResultadoDTO;
import edu.cibertec.beans.UsuarioEventoDTO;
import edu.cibertec.service.UsuarioEventoService;

@Path("/api")
public class UsuarioEventoController {

	@POST
	@Path("/usuarioeventos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO RegistrarUsuarioEvento(UsuarioEventoDTO datos) {

		ResultadoDTO resultado = null;
		UsuarioEventoService js = new UsuarioEventoService();
		
		int ok = js.RegistrarUsuarioEvento(datos);
		
		
		if(ok == 0) {
			
			System.out.println("Error al Registrar Usuario Evento");
			
			resultado = new ResultadoDTO(0, "Registro Incorrecto");
			
		}else {
			
			System.out.println("Usuario Evento Registrado Exitosamente");
			
			resultado = new ResultadoDTO(1, "Usuario Evento Registrado");
		}
		
		
		System.out.println("Fin: RegistrarUsuarioEvento()");
		
		return resultado;
	}

	
	@POST
	@Path("/usuarioeventos/actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO ActualizarUsuarioEvento(UsuarioEventoDTO datos) {

		ResultadoDTO resultado = null;
		UsuarioEventoService js = new UsuarioEventoService();
		int ok = js.ActualizarUsuarioEvento(datos);
		
		if(ok == 0) {
			
			System.out.println("Error al Actualizar Usuario Evento");
			
			resultado = new ResultadoDTO(0, "Actualizar Incorrecto");
			
		}else {
			
			System.out.println("Usuario Evento Actualizado Exitosamente");
			
			resultado = new ResultadoDTO(1, "Usuario Evento Actualizado");
		}
		
		
		System.out.println("Fin: ActualizarUsuarioEvento()");
		
		return resultado;
	}
	
	@POST
	@Path("/usuarioeventos/eliminar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO EliminarUsuarioEvento(UsuarioEventoDTO datos) {

		ResultadoDTO resultado = null;
		UsuarioEventoService js = new UsuarioEventoService();
		int ok = js.EliminarUsuarioEvento(datos);
		
		if(ok == 0) {
			
			System.out.println("Error al Eliminar Usuario Evento");
			
			resultado = new ResultadoDTO(0, "Eliminacion Incorrecta");
			
		}else {
			
			System.out.println("Usuario Evento Eliminado Exitosamente");
			
			resultado = new ResultadoDTO(1, "Usuario Evento Eliminado");
		}
		
		
		System.out.println("Fin: EliminarUsuarioEvento()");
		
		return resultado;
	}
}
