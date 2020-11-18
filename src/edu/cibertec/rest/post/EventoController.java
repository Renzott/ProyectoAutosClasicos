package edu.cibertec.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.EventosDTO;
import edu.cibertec.beans.ResultadoDTO;
import edu.cibertec.service.EventosService;

@Path("/api")
public class EventoController {

	@POST
	@Path("/evento")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO RegistrarEventos(EventosDTO eve) {
		
		System.out.println("Inic: RegistrarEventos()");

		ResultadoDTO resultado = null;
		
		
		EventosService es = new EventosService();
		
		int ok = es.RegistrarEventos(eve);
		
		
		if(ok == 0) {
			
			System.out.println("Error al Registrar Jugador");
			
			resultado = new ResultadoDTO(0, "Registro Incorrecto");
			
		}else {
			
			System.out.println("Jugador Registrado Exitosamente");
			
			resultado = new ResultadoDTO(1, "Jugador Registrado");
		}
		
		
		System.out.println("Fin: RegistrarEventos()");
		
		return resultado;
	}
	
	@POST
	@Path("/evento/actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO ActualizaEventos(EventosDTO eve) {
		
		System.out.println("Inic: ActualizaEventos()");
		
		ResultadoDTO resultado = null;
		
		EventosService es = new EventosService();
		
		int ok = es.ActualizarEventos(eve);
		
		if(ok == 0) {
			
			System.out.println("Error al Registrar Evento");
			
			resultado = new ResultadoDTO(0, "Registro Incorrecto");
			
		}else {
			
			System.out.println("Jugador Registrado Exitosamente");
			
			resultado = new ResultadoDTO(1, "Evento Registrado");
		}
		
		System.out.println("Fin: ActualizaEventos()");
		
		return resultado;
	}
	
	@POST
	@Path("/evento/eliminar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO EliminarEventos(EventosDTO eve) {
		
		System.out.println("Inic: EliminarEventos()");
		
		ResultadoDTO resultado = null;
		
		
		EventosService es = new EventosService();
		
		int ok = es.EliminarEventos(eve);
		
		
		if(ok == 0) {
			
			System.out.println("Error al Eliminar Eventos");
			
			resultado = new ResultadoDTO(0, "Eliminacion Incorrecto");
			
		}else {
			
			System.out.println("Evento Eliminado Exitosamente");
			
			resultado = new ResultadoDTO(1, "Evento Eliminado");
		}
		
		
		System.out.println("Fin: EliminarEventos()");
		
		return resultado;
	}
}
