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

@Path("/tipoget")
public class ServiciosCotizarGet {
	//Primer Servicio -> "ListarCotizarAutos"
	
		/*
		 - Defino mi endPoint:
		 
		 http://localhost:8080/ProyectoAutosClasicos/tipoget/ListadoCotizarAutos
		*/
	@GET
	@Path("/ListadoCotizarAutos")
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
			 respuesta = new RespuestaListadoDTO(lista, null, null);
		 }
		
		System.out.println("fin: ListarCotizarAutos()");
		
		return respuesta;
	}
	/*--------------------------------------------------------------*/
	//Segundo Servicio -> "ListarCotizarAutosPorCodigoMarcaAuto()"
	
		/*
		 - Defino mi endPoint:
		 
		 http://localhost:8080/ProyectoAutosClasicos/tipoget/ListadoCotizarAutosPorCodigoMarcaAuto/1
		*/
	@GET
	@Path("/ListadoCotizarAutosxCodigoMarcaAuto/{CodigoxMarcaAuto}")
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
			 respuesta = new RespuestaListadoDTO(lista, null, null);
		 }
			System.out.println("fin: ListarCotizarAutosPorCodigoMarcaAuto()");
		
		return respuesta;
	}
	/*--------------------------------------------------------------*/
	//Tercer Servicio -> "ListadoCotizarAutosPorCodigoAuto()"
	
		/*
		 - Defino mi endPoint:
		 
		 http://localhost:8080/ProyectoAutosClasicos/tipoget/ListadoCotizarAutosPorCodigoAuto/1
		*/
	@GET
	@Path("/ListadoCotizarAutosPorCodigoAuto/{CodigoxAuto}")
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
			 respuesta = new RespuestaListadoDTO(lista, null, null);
		 }
		
		System.out.println("fin: ListarCotizarAutosPorCodigoAuto()");
		
		return respuesta;
	}
}
