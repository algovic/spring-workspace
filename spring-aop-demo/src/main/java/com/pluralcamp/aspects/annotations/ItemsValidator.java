package com.pluralcamp.aspects.annotations;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ItemsValidator {

	// Antes
	@Before("execution(* com.pluralcamp.aspects.annotations.Purchase.buy(..))")
	public void checkAmount() {
		System.out.println("Comprobando que " + "la cantidad de items sea correcta.");

	}

	// Despues
	@AfterReturning("execution(* com.pluralcamp.aspects.annotations.Purchase.buy(..))")
	public void pack() {
		System.out.println("Empaquetando los productos...");
	}

	// Al lanzar una excepcion
	@AfterThrowing("execution(* com.pluralcamp.aspects.annotations.Purchase.buy(..))")
	public void fileComplain() {
		System.out.println("Queja por productos " + "defectuosos.");
	}
}
