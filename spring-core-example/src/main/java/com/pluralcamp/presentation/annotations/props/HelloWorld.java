package com.pluralcamp.presentation.annotations.props;

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
@Component(value = "helloWorld")
@Scope("prototype")
public class HelloWorld {
	
	@Autowired
	@Value("Hello World from property")
	private String hello;
		
	private UUID uuid;

	/**
	 * Parameterless Constructor
	 */
	public HelloWorld() {
		this.uuid = UUID.randomUUID();
	}


	public HelloWorld(String hello) {		
		this();
		this.hello = hello;
	}
	
	
	//getters / setters
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	/**
	 * getter
	 * @return
	 */
	public String getHello() {
		return hello;
	}
	
	/**
	 * setter
	 * @param hello
	 */
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	
}

