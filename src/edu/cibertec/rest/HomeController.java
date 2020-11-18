package edu.cibertec.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import javax.ws.rs.core.MediaType;

@Path("/")
public class HomeController {

    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public String getHello(){

        return "API Working!";

    }

}
