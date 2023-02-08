package com.pluralcamp.presentation.annotations;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Amb l'anotació @Scope indiquem quan es crearan
 * les instàncies de la classe i en quin àmbit.
 * Si no s'usa l'anotació @Scope el seu valor
 * per defecte és singleton. Els seus possibles
 * valors són:
 * 
 * - singleton: es crea una única instància del bean per a tota l'aplicació.
 * - prototype: es crea una nova instància del bean cada vegada que es fa una crida.
 * - request: es crea una nova instància del bean per a cada petició Http.
 * - session: es crea una nova instància del bean per a cada sessió Http.
 * - globalSession: es crea una nova instància del bean per a cada sessió global Http.
 */
@Scope("prototype")
@Component("helloWorldConst")
public class HelloWorld {

	private String hello;
	private UUID uuid;
	
	public HelloWorld() {}
	
	@Autowired
	public HelloWorld(@Value("Hello World from constructor") String hello) {
		this.setUuid(UUID.randomUUID());
		this.setHello(hello);
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}	
	
}
