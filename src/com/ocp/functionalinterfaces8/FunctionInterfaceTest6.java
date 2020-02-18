package com.ocp.functionalinterfaces8;

import java.util.function.BinaryOperator;

public class FunctionInterfaceTest6 {
	public void magic(BinaryOperator<Long> lambda) {
		lambda.apply(3L, 7L);
	}
	
	public static void main(String[] args) {
		FunctionInterfaceTest6 obj = new FunctionInterfaceTest6();
		obj.magic((x,y)-> (long) y.intValue());					
	}
	
	
}