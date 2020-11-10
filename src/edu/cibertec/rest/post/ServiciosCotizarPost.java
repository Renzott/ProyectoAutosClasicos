package edu.cibertec.rest.post;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.CotizarAutoDTO;
import edu.cibertec.beans.ResultadoDTO;
import edu.cibertec.service.CotizarAutoService;

@Path("/tipopost")
public class ServiciosCotizarPost {
	//1. Servicio de Registrar!
	//http://localhost:8080/ProyectoAutosClasicos/tipopost/regcoti

	@POST
	@Path("/regcoti")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO RegCotizarAuto(CotizarAutoDTO coti) {
		
		System.out.println("Inic: RegCotizarAuto()");
		System.out.println("Codigo Cotizar Auto: " + coti.getCodigoCotizarAuto());
		System.out.println("Nro Documento CotizarAuto: " + coti.getNroDocumentoCotizarAuto());
		System.out.println("Nombres CotizarAuto: " + coti.getNombresCotizarAuto());
		System.out.println("Apellidos CotizarAuto: " + coti.getApellidosCotizarAuto());
		System.out.println("Correo CotizarAuto: " + coti.getCorreoCotizarAuto());
		System.out.println("Suma AseguradoraDolar CotizarAuto: " + coti.getSumaAseguradoraDolarCotizarAuto());
		System.out.println("Telefono Cotizar Auto: " + coti.getTelefonoCotizarAuto());
		System.out.println("Codigo MarcaAuto: " + coti.getCodigoMarcaAuto());
		System.out.println("Codigo Auto: " + coti.getCodigoAuto());
		
		ResultadoDTO resultado = null;
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
	
	//2. Servicio de Actualizar
	/*Defino el ENDPOINT del segundo Servicio:

	http://localhost:8080/ProyectoAutosClasicos/tipopost/actcoti
	*/
	@POST
	@Path("/actcoti")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO ActCotizarAuto(CotizarAutoDTO coti) {
		
		System.out.println("Inic: ActCotizarAuto()");
		System.out.println("Codigo Cotizar Auto: " + coti.getCodigoCotizarAuto());
		System.out.println("Nro Documento CotizarAuto: " + coti.getNroDocumentoCotizarAuto());
		System.out.println("Nombres CotizarAuto: " + coti.getNombresCotizarAuto());
		System.out.println("Apellidos CotizarAuto: " + coti.getApellidosCotizarAuto());
		System.out.println("Correo CotizarAuto: " + coti.getCorreoCotizarAuto());
		System.out.println("Suma AseguradoraDolar CotizarAuto: " + coti.getSumaAseguradoraDolarCotizarAuto());
		System.out.println("Telefono Cotizar Auto: " + coti.getTelefonoCotizarAuto());
		System.out.println("Codigo MarcaAuto: " + coti.getCodigoMarcaAuto());
		System.out.println("Codigo Auto: " + coti.getCodigoAuto());
		
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
	//3. Servicio de Eliminar!
	
			/*Defino el ENDPOINT del tercer Servicio:

			http://localhost:8080/ProyectoAutosClasicos/tipopost/elimcoti
			*/
	@POST
	@Path("/elimcoti")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO ElimCotizarAuto(CotizarAutoDTO coti) {
		System.out.println("Inic:ElimCotizarAuto()");
		System.out.println("Codigo Cotizar Auto: " + coti.getCodigoCotizarAuto());
		
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
