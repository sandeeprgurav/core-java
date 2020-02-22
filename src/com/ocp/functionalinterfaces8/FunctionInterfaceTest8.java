package com.ocp.functionalinterfaces8;

import java.util.Arrays;
import java.util.Collection;

public class FunctionInterfaceTest8 {
	int count = 0;
	   public void sneak(Collection<String> coll) {
	      coll.stream().peek(r -> {count++; System.out.println(r); }).findFirst();
	   }
	 
	   public static void main(String[] args) {
		   FunctionInterfaceTest8 c = new FunctionInterfaceTest8();
	      c.sneak(Arrays.asList("weasel"));
	  }
}

//Ans: peek(r -> {count++; System.out.println(r); }).findFirst()