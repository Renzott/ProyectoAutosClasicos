package edu.cibertec.rest.get;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.EventosDTO;
import edu.cibertec.beans.RespuestaListadoDTO;
import edu.cibertec.service.EventosService;

@Path("/api")
public class EventoController {

	
	@GET
	@Path("/eventos")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaListadoDTO ListarEventosX() {
		System.out.println("ini: ListarEventosX()");
		RespuestaListadoDTO respuesta = null;
		EventosService es = new EventosService();
		
		ArrayList<EventosDTO> lista = es.ListadoEventos();
		if(lista == null) {
			 
			System.out.println("Listado de Eventos esta Vacios");
				 
		 }else {
			 
			 System.out.println("Te envio todo el listado de Eventos!");
			 respuesta = new RespuestaListadoDTO(lista);
		 }
			System.out.println("fin: ListarEventosX()");
		
		return respuesta;
	}

	@GET
	@Path("/eventos/auto/{codAutox}")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaListadoDTO ListarEventosXCodigoAuto(@PathParam("codAutox") String CodAuto) {
		
		
		System.out.println("ini: ListarEventosXCodigoAuto()");
		
		System.out.println("IdPais: " + CodAuto);
		
		
		RespuestaListadoDTO respuesta = null;
		
		EventosService es = new EventosService();
		
		ArrayList<EventosDTO> lista = es.ListadoEventosPorCodigoAuto(CodAuto);
		
		if(lista == null) {
			 
			System.out.println("Listado de Jugadores x Pais Vacios");
				 
		 }else {
			 
			 System.out.println("Te envio todo el listado x Pais!");
			 respuesta = new RespuestaListadoDTO( lista); //EventosDTO(lista);
		 }
		
		
		System.out.println("fin: ListarEventosXCodigoAuto()");
		
		return respuesta;
	}
}
