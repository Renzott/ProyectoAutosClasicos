package edu.cibertec.rest.get;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.cibertec.beans.RespuestaListadoDTO;
import edu.cibertec.beans.UsuarioEventoDTO;
import edu.cibertec.service.UsuarioEventoService;

@Path("/api/")
public class UsuarioEventoController {

    /*
     * Endpoint : api/usuarioeventos
     * */
    @GET
    @Path("/usuarioeventos")
    @Produces(MediaType.APPLICATION_JSON)
    public RespuestaListadoDTO ListarUsuarioEvento() {

        System.out.println("ini: ListarUsuarioEvento()");

        RespuestaListadoDTO respuesta = null;

        UsuarioEventoService js = new UsuarioEventoService();

        ArrayList<UsuarioEventoDTO> lista = js.ListadoUsuarioEvento();

        if (lista == null) {

            System.out.println("Listado de Usuario Eventos Vacios");

        } else {

            System.out.println("Te envio todo el listado de Usuario x Eventos!");
            respuesta = new RespuestaListadoDTO(lista);
        }


        System.out.println("fin: ListarUsuarioEvento()");

        return respuesta;
    }

    /*
     * Endpoint : api/usuarioevento/{codigoEvento}
     * */
    @GET
    @Path("/usuarioevento/{codEventos}")
    @Produces(MediaType.APPLICATION_JSON)
    public RespuestaListadoDTO ListaRUsuarioEventoPorCodigoEvento(@PathParam("codEventos") String CodEventos) {


        System.out.println("ini: ListaRUsuarioEventoPorCodigoEvento()");

        System.out.println("CodEventos: " + CodEventos);


        RespuestaListadoDTO respuesta = null;

        UsuarioEventoService js = new UsuarioEventoService();

        ArrayList<UsuarioEventoDTO> lista = js.ListadoUsuarioEventoPorCodigoEvento(CodEventos);

        if (lista == null) {

            System.out.println("Listado de UsuarioEventos x Codigo Eventos Vacios");

        } else {

            System.out.println("Te envio todo el listado de Usuario Eventos por Cod Eventos!");
            respuesta = new RespuestaListadoDTO(lista);
        }


        System.out.println("fin: ListaRUsuarioEventoPorCodigoEvento()");

        return respuesta;
    }
}
