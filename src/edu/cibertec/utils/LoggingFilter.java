package edu.cibertec.utils;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.Optional;

@Provider
public class LoggingFilter implements ContainerRequestFilter {


    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        System.out.println(containerRequestContext.getMethod() + " " +
                Optional.ofNullable(containerRequestContext.getUriInfo().getPath()).filter(s -> !s.isEmpty()).orElse("/"));
    }
}
