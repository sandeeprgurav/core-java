package com.oops.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {     
		Ramchandra parent = new Ramchandra();		
		Sandeep child = new Sandeep();
		
		
		Male male = new Male();
		male.functionOfEyes();
		male.functionOfNose();
		male.functionOfTounge();
		male.maleAditionalFunction();
		
		
		Female female = new Female();
		female.functionOfEyes();
		female.functionOfNose();
		female.functionOfTounge();
		female.femaleAditionalFunction();				
		
	}
}
