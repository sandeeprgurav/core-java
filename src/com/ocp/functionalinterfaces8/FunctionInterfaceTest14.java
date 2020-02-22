package com.ocp.functionalinterfaces8;

import java.util.function.DoubleSupplier;

public class FunctionInterfaceTest14 {
	String name;
	Integer cost;

	public FunctionInterfaceTest14(String name, Integer cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public Integer getCost() {
		return cost;
	}
	
	public static void main(String[] args) {
		FunctionInterfaceTest14 obj = new FunctionInterfaceTest14("IT", null);
		DoubleSupplier s = obj::getCost;
		System.out.println(obj.getName()+"  "+ s.getAsDouble()); //java.lang.NullPointerException 
		//System.out.println(obj.getName()+"  "+ obj.getCost()); //IT null
		
	}

}

// Ans: java.lang.NullPointerException
