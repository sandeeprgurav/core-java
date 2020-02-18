package com.ocp.others12;

import java.util.ArrayList;
import java.util.List;
class Laptop1 extends InheritanceTest10 {
	String type = "laptop";
}

public class InheritanceTest10 {
	String type = "computer";

	public static void main(String[] args) {
		InheritanceTest10 superObj = new Laptop1();
		Laptop1 childObj = new Laptop1();
		System.out.print(superObj.type + "," + childObj.type);
	}
}
//Ans: computer,laptop