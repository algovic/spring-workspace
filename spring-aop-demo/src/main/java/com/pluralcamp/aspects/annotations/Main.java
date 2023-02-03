package com.pluralcamp.aspects.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.pluralcamp.aspects.annotations");
		context.refresh();

		Shopping purchase = context.getBean(Shopping.class);

		System.out.println(purchase);

		try {
			purchase.buy(true); //false no da error, true lanza la excepcion
		} catch(Exception e) {
			System.err.println("Error en la compra intentelo mas tarde.");
		}

	}

}
