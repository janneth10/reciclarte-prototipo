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
				,new Persona(3,"Carolina"), new Persona(4, "Yhorman")
				, new Persona(5, "Mario"), new Persona(6, "Alex")
				, new Persona(7, "Hyoandri"), new Persona(8, "MeMo")
				, new Persona(9, "Malviajes"), new Persona(10, "Ingrid")
				, new Persona(11, "Luisa"), new Persona(12, "Metacho")
				, new Persona(13, "Cachondo"), new Persona(14, "Kevin")
				, new Persona(15, "Fornesto"), new Persona(16, "Judas")
				, new Persona(17, "Pereza mental"), new Persona(18, "Zorra")
				, new Persona(19, "Nigga"), new Persona(20, "Borracho")
				, new Persona(21, "Perea"), new Persona(22, "Gestor")
				, new Persona(23, "Uribito")};
	}
	
	@POST
	@Path("/nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Persona crear(Persona persona) {
		return persona;
	}
}
