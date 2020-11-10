package edu.cibertec.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.ResultadoDTO;
import edu.cibertec.beans.UsuarioEventoDTO;
import edu.cibertec.service.UsuarioEventoService;

@Path("/tipopost")
public class ServiciosUsuarioEventosPost {

	@POST
	@Path("/regUsuEvent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO RegistrarUsuarioEvento(UsuarioEventoDTO datos) {
		
		System.out.println("Inic: RegistrarUsuarioEvento()");
		System.out.println("Codigo Usuario Evento: " + datos.getCodigoUsuarioEvento());
		System.out.println("NroDocumentoUsuarioEvento: " + datos.getNroDocumentoUsuarioEvento());
		System.out.println("NombresUsuarioEvento: " + datos.getNombresUsuarioEvento());
		System.out.println("ApellidosUsuarioEvento: " + datos.getApellidosUsuarioEvento());
		System.out.println("FechaNacimientoUsuarioEvento: " + datos.getFechaNacimientoUsuarioEvento());
		System.out.println("CorreoUsuarioEvento: " + datos.getCorreoUsuarioEvento());
		System.out.println("CodigoEventos: " + datos.getCodigoEventos());
		
		
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
	/*-----------------------------------------------------------*/
	
	
	
	//2. Servicio de Actualizar!
	
	/*Defino el ENDPOINT del segundo Servicio:

	http://localhost:8080//tipopost/
	*/
	
	
	/* BODY
	  
	  {
            
        }
	*/
	
	@POST
	@Path("/actUsuEvent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO ActualizarUsuarioEvento(UsuarioEventoDTO datos) {
		System.out.println("Inic: ActualizarUsuarioEvento()");
		System.out.println("Codigo Usuario Evento: " + datos.getCodigoUsuarioEvento());
		System.out.println("NroDocumentoUsuarioEvento: " + datos.getNroDocumentoUsuarioEvento());
		System.out.println("NombresUsuarioEvento: " + datos.getNombresUsuarioEvento());
		System.out.println("ApellidosUsuarioEvento: " + datos.getApellidosUsuarioEvento());
		System.out.println("FechaNacimientoUsuarioEvento: " + datos.getFechaNacimientoUsuarioEvento());
		System.out.println("CorreoUsuarioEvento: " + datos.getCorreoUsuarioEvento());
		System.out.println("CodigoEventos: " + datos.getCodigoEventos());
		
		
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
	/*-----------------------------------------------------------*/
	
	
	//3. Servicio de Eliminar!
	
		/*Defino el ENDPOINT del tercer Servicio:

		http://localhost:8080/JugadorDAO/tipopost/elim
		*/
		
		
		/* BODY
		  
		  {
	        "codigo": 11
	      }
		*/
	
	
	@POST
	@Path("/elim")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO EliminarUsuarioEvento(UsuarioEventoDTO datos) {
		
		System.out.println("Inic: EliminarUsuarioEvento()");
		System.out.println("Codigo Usuario Evento: " + datos.getCodigoUsuarioEvento());

		
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
