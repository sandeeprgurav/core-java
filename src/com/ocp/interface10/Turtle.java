package com.ocp.interface10;

abstract interface CanSwim {
	public void swim();
}

public class Turtle {
	public static void main(String[] seaweed) {
	      int distance = 7;
	      //CanSwim seaTurtle ={ // new CanSwim() is missing will throw compile exception 
	      CanSwim seaTurtle =new CanSwim() {
	         @Override
	         public void swim() {
	            System.out.print(distance);
	         }
	      };
	      seaTurtle.swim();
	   }
}


//One line of this application fails to compile.