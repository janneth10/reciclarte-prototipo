package com.reciclarteprototipo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class BienvenidoEndpoint {
	@GET
	@Produces("text/plain")
	public Response get() {
		return Response.ok("Bienvenido seas desde WildFly Swarm!").build();
	}
	
	@GET
	@Path("/hola")
	@Produces("text/plain")
	public Response hola() {
		return Response.ok("Hola desde Heroku!").build();
	}
}
