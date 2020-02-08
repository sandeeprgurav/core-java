package com.ocp;

public class AssertErrorTest {
  public double applyDiscount(double price) {
	  assert (price>0); 
	  return price* 0.50;
  }
  
  public static void main(String[] args) {
	  args = new String[]{"0"};	  
	AssertErrorTest test = new AssertErrorTest();
	double newPrice = test.applyDiscount(Double.parseDouble(args[0]));
	System.out.println("New Price == "+ newPrice);
}
}
//Ans : New Price: 0.0 
//An AssertionError is thrown. in dbExam.com