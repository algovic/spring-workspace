package com.pluralcamp.presentation.config;


/*
 * No està marcada ni amb @Component ni amb @Scope
 * 
 * La injecció del bean es fa via Code As Configuration:
 * es crea l'objecte HelloWorld via codi (no via reflexió).
 * HelloWorld queda com a POJO = Plain Old Java Object
 * Tot es fa via classe de configuració.
 */
public class HelloWorld {
	
	private String hello;
	
	public HelloWorld() {
		
	}
	
	public HelloWorld(String hello) {
		this.setHello(hello);
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}	
}
