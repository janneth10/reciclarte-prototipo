package com.reciclarteprototipo.rest;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

import com.reciclarteprototipo.entities.Persona;

public class RestApplication {
	public static void main(String[] args) throws Exception {
		Container container = new Container();
		container.start();
		JAXRSArchive deployment=ShrinkWrap.create(JAXRSArchive.class);
		deployment.addClasses(Persona.class);
		deployment.addResource(BienvenidoEndpoint.class);
		deployment.addResource(PersonaEndpoint.class);		
		deployment.addAllDependencies();
		container.deploy(deployment);
	}
}
