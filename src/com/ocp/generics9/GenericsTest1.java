package com.ocp.generics9;

class Wash1<T> {
	   T item;
	   public void clean(T item) {
	      System.out.println("Clean " + item);
	   }
	}

	public class GenericsTest1 {
	   public static void main(String[] args) {
		  //Wash1 wash = new Wash1();
		  Wash1<String> wash = new Wash1<>();
		  //Wash1 wash = new Wash1<String>();
	      wash.clean("socks");
	   }
	}
//Ans: All three can fill in the blank.