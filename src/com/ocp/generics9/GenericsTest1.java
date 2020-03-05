package com.ocp.generics9;

class Wash1<T> {
	   T item;
	   public void clean(T item) {
	      System.out.println("Clean " + item);
	   }
	}

	public class GenericsTest1 {
	   public static void main(String[] args) {
		  Wash1 wash1 = new Wash1(); //1
		  Wash1<String> wash2 = new Wash1<>(); //2
		  Wash1<String> wash3 = new Wash1(); //3
	      wash1.clean("socks");
	      
	   }
	}
//Ans: All three can fill in the blank.