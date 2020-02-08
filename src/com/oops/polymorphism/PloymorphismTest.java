package com.oops.polymorphism;

public class PloymorphismTest {

	public static void main(String[] args) {
      Calculator calculator = new Calculator();
      
      System.out.println("Additing two int values ==" + calculator.add(10,20));
      System.out.println("Additing two int values ==" + calculator.add(10,20,30));
      System.out.println("Additing two int values ==" + calculator.add(10.20,20.30));
      System.out.println("Additing two int values ==" + calculator.add(10.20,20.30,30.40));
	}
}
