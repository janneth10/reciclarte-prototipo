package com.reciclarteprototipo.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.reciclarteprototipo.entities.Persona;

@Path("/personas")
@ApplicationScoped
public class PersonaEndpoint {
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Persona[] all() {
		return new Persona[] {new Persona(1,"Daniel"),new Persona(2,"Janneth")
				,new Persona(3,"Carolina"), new Persona(4, "Yhorman")};
	}
	
	@POST
	@Path("/nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Persona crear(Persona persona) {
		return persona;
	}
}
