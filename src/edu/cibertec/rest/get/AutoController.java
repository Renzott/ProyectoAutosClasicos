package edu.cibertec.rest.get;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.AutoDTO;
import edu.cibertec.beans.RespuestaDTO;
import edu.cibertec.service.AutoService;

@Path("/api")
public class AutoController {

	/*
	* Endpoint : api/autos
	* */
	@GET
	@Path("/autos")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaDTO listarAutos(){
		System.out.println("ini: listarAutos()");
		RespuestaDTO respuesta = null;
		
		AutoService autoService = new AutoService();
		ArrayList<AutoDTO> lista = autoService.ListadoAuto();
		
		if (lista == null) {
			System.out.println("Listado Vacío");
		}else {
			System.out.println("Consulta Exitosa");
			respuesta = new RespuestaDTO(lista);
		}

		System.out.println("fin: listarAutos()");
		
		return respuesta;
	}

	/*
	 * Endpoint : api/auto/{codigo}
	 * */
	@GET
	@Path("/auto/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaDTO listarAutoxCodigo(@PathParam("codigo") String codigo){
		System.out.println("ini: listarAutoxCodigo()");
		RespuestaDTO respuesta = null;
				
		AutoService autoService = new AutoService();
		AutoDTO auto = autoService.ListadoAutoPorCodigo(codigo);
		ArrayList<AutoDTO> lista = new ArrayList<AutoDTO>();
		lista.add(auto);
		
		if (auto == null) {
			System.out.println("Listado Vacío");
		}else {
			System.out.println("Consulta Exitosa");
			respuesta = new RespuestaDTO(lista);
		}

		System.out.println("fin: listarAutoxCodigo()");
		
		return respuesta;
	}
}
