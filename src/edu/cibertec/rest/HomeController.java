package edu.cibertec.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;


@Path("/")
public class HomeController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHello(){

        return "API Working!";

    }

}
