package com.ocp.functionalinterfaces8;

import java.util.ArrayList;
import java.util.List;

public class FunctionInterfaceTest12 {
	public static void main(String... future) {
		List<String> list = new ArrayList<>();		
		list.add("Monday");
		//list.add(String::new); //The target type of this expression must be a functional interface
		list.add("Tuesday");
		list.remove(0);
		System.out.println(list.get(0));
	}
}

//Ans: The code does not compile.


