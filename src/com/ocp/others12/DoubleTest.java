package com.ocp.others12;

public class DoubleTest {
	public static void main(String[] args) {
		 
		try {
			Double number = Double.valueOf("120D");
			System.out.println(number);
		} catch (NumberFormatException ex) {
			System.out.println("ex");
		}
		//System.out.println(number);	
	}
}

//120.0 
//DBExam: A NumberFormatException will be thrown.