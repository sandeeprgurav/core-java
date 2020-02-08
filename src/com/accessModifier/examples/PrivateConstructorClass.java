package com.accessModifier.examples;

public class PrivateConstructorClass {
	static PrivateConstructorClass privateConstructorClass = null;
	private PrivateConstructorClass(){
		
	}
	
	public static PrivateConstructorClass getSingletonInstance() {		
		if(privateConstructorClass==null) {
			return new PrivateConstructorClass();
		}
		return privateConstructorClass;
	}
	
}
