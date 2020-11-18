package edu.cibertec.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.CotizarAutoDTO;
import edu.cibertec.beans.ResultadoDTO;
import edu.cibertec.service.CotizarAutoService;

@Path("/api")
public class CotizarController {

	@POST
	@Path("/cotizacion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO RegCotizarAuto(CotizarAutoDTO coti) {

		ResultadoDTO resultado;
		CotizarAutoService cs = new CotizarAutoService();
		int ok = cs.RegistrarCotizarAuto(coti);
		if(ok == 0) {
			System.out.println("Error al Registrar Cotizacion de Auto");
			resultado = new ResultadoDTO(0,"Cotizacion de Auto Incorrecto");
		}else {
			System.out.println("Cotizacion de Auto Registrado Exitosamente");	
			resultado = new ResultadoDTO(1,"Cotizacion de Auto Registrado");
		}
		
		System.out.println("Fin: RegCotizarAuto()");
		
		return resultado;
	
	}


	@POST
	@Path("/cotizacion/actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO ActCotizarAuto(CotizarAutoDTO coti) {

		ResultadoDTO resultado = null;
		CotizarAutoService cs = new CotizarAutoService();
		int ok = cs.ActualizarCotizarAuto(coti);
		if(ok == 0) {
			System.out.println("Error al Actualizar Cotizacion de Auto");
			resultado = new ResultadoDTO(0, "Actualizacion Incorrecta");
		}else {
			System.out.println("Cotizacion de Auto Actualizado  Exitosamente");
			resultado = new ResultadoDTO(1, "Cotizacion de Auto Actualizado");
		}
		
			System.out.println("Fin: ActCotizarAuto()");
		return resultado;
	}


	@POST
	@Path("/cotizacion/eliminar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO ElimCotizarAuto(CotizarAutoDTO coti) {
		
		ResultadoDTO resultado = null;
		CotizarAutoService cs = new CotizarAutoService();
		int ok = cs.EliminarCotizarAuto(coti);
		if(ok == 0) {
			
			System.out.println("Error al Eliminar Cotizacion de Auto");
			resultado = new ResultadoDTO(0, "Eliminacion Incorrecta");	
		}else {
			System.out.println("Cotizacion de Auto Eliminado  Exitosamente");
			resultado = new ResultadoDTO(1, "Cotizacion de Auto Eliminado");
		}
		System.out.println("Fin:ElimCotizarAuto()");
		return resultado;
	
	}
	
}
