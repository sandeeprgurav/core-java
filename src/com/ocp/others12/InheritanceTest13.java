package com.ocp.others12;

class SuperClass {}
class SubClass extends SuperClass{}
public class InheritanceTest13 {

	public static void main(String[] args) {
		SuperClass superClass =  new SuperClass();
		SubClass subClass = new SubClass();
		SuperClass bh = new SubClass();
		SuperClass p = (SubClass) superClass; // RUNTIME ERROR
		//SubClass q = (SuperClass) subClass; //cant cast SubClass with SuperClass  COMPILE TIME ERROR
		SuperClass r = (SuperClass) bh;
		SubClass s = (SubClass) bh;
	}

	// Ans: House q = (Building) h;
}

