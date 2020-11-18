package edu.cibertec.rest.get;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.CotizarAutoDTO;
import edu.cibertec.beans.RespuestaListadoDTO;
import edu.cibertec.service.CotizarAutoService;

@Path("/api")
public class CotizarController {

	@GET
	@Path("/cotizaciones")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaListadoDTO ListarCotizarAutos() {
		
		System.out.println("ini: ListarCotizarAutos()");
		RespuestaListadoDTO respuesta = null;
		CotizarAutoService cas = new CotizarAutoService();
		ArrayList<CotizarAutoDTO> lista = cas.ListadoCotizarAutos();
		if(lista == null) {
		
			System.out.println("Listado de Cotizar Autos  Vacios");
				 
		 }else {
			 
			 System.out.println("Te envio todo el listado de Cotizacion de Autos!");
			 respuesta = new RespuestaListadoDTO(lista);
		 }
		
		System.out.println("fin: ListarCotizarAutos()");
		
		return respuesta;
	}

	@GET
	@Path("/cotazaciones/marcaauto/{CodigoxMarcaAuto}")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaListadoDTO ListarCotizarAutosPorCodigoMarcaAuto(@PathParam("CodigoxMarcaAuto") String CodMarcaAuto) {
		
		System.out.println("ini: ListarCotizarAutosPorCodigoMarcaAuto()");
		System.out.println("CodMarcaAuto: " + CodMarcaAuto);
		
		RespuestaListadoDTO respuesta = null;
		CotizarAutoService cas = new CotizarAutoService();
		ArrayList<CotizarAutoDTO> lista = cas.ListadoCotizarAutosPorCodigoMarcaAuto(CodMarcaAuto);
		
		if(lista == null) {
			 
			System.out.println("Listado de Cotizar Autos x Marca Auto Vacios");
				 
		 }else {
			 
			 System.out.println("Te envio todo el listado de Cotizacion de Autos x Marca Autos!");
			 respuesta = new RespuestaListadoDTO(lista);
		 }
			System.out.println("fin: ListarCotizarAutosPorCodigoMarcaAuto()");
		
		return respuesta;
	}


	@GET
	@Path("/cotazaciones/auto/{CodigoxAuto}")
	@Produces(MediaType.APPLICATION_JSON)
	public RespuestaListadoDTO ListadoCotizarAutosPorCodigoAuto(@PathParam("CodigoxAuto") String CodAuto) {
		
		System.out.println("ini: ListarCotizarAutosPorCodigoAuto()");
		System.out.println("CodMarcaAuto: " + CodAuto);
		
		RespuestaListadoDTO respuesta = null;
		CotizarAutoService cas = new CotizarAutoService();
		ArrayList<CotizarAutoDTO> lista = cas.ListadoCotizarAutosPorCodigoAuto(CodAuto);
		
		if(lista == null) {
			 
			System.out.println("Listado de Cotizar Autos x Codigo Auto Vacios");
				 
		 }else {
			 
			 System.out.println("Te envio todo el listado de Cotizacion de Autos x Codigo Autos!");
			 respuesta = new RespuestaListadoDTO(lista);
		 }
		
		System.out.println("fin: ListarCotizarAutosPorCodigoAuto()");
		
		return respuesta;
	}
}
