package com.ocp.functionalinterfaces8;

interface Runnable{
public void run();
}
public class FunctionInterfaceTest11 {
	Runnable run1 = () -> { System.out.println("Run");};  //; is needed to compile the code. 
	Runnable run2 = () ->  System.out.println("Run");
}

//Ans: peek(r -> {count++; System.out.println(r); }).findFirst()