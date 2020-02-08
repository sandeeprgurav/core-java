package com.accessModifier.examples;

public class ProtectedConstructorClass {
	
	protected ProtectedConstructorClass(){
		
	}
			
}


class ProtectedConstructorSubClass extends ProtectedConstructorClass{
	ProtectedConstructorSubClass(){
		super();
	}
}