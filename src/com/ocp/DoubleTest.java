package com.ocp;

public class DoubleTest {
	public static void main(String[] args) {
		 
		try {
			Double number = Double.valueOf("120D");
		} catch (NumberFormatException ex) {
			System.out.println("ex");
		}
		//System.out.println(number);	
	}
}

//120.0 
//DBExam: A NumberFormatException will be thrown.