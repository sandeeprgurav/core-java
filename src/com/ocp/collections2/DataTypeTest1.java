package com.ocp.collections2;

public class DataTypeTest1 {
  static double area;
  int b=2, h=3;
  public static void main(String[] args) {
	double p = 0,b = 0,h = 0;
	//double p,b,h; local variable should be initialzed before using them.
	if(area==0) {
		b=3;
		h=4;
		p=0.5;
	}
	area= p*b*h;
	System.err.println("Area is "+ area);
}
}

//Ans: Compilation fails at line n2