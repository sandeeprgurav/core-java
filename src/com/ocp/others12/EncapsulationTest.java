package com.ocp.others12;

public class EncapsulationTest {
  String name;
  boolean contract;
  double salary;
  
  EncapsulationTest(){
	   
  }
@Override
public String toString() {
	return "EncapsulationTest [name=" + name + ", contract=" + contract + ", salary=" + salary + "]";
}
  
public static void main(String[] args) {
	EncapsulationTest e = new EncapsulationTest();
	e.name= "Joe";
	
	System.out.println(e);
}
}
