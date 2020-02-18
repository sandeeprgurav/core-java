package com.ocp.exceptions6;

import java.util.ArrayList;

public class ExceptionTest5 {
	public static void main(String[] args) throws Exception {
		ArrayList myList = new ArrayList();
		String[] myArray;
		try {
			while (true) {
				myList.add("My String");
			}
		} catch (RuntimeException re) {
			System.out.println("RuntimeException");

		} catch (Exception e) {
			System.out.println("Exception");
		}

		System.out.println("Ready to use");
	}
}

//Ans: Out of memory exception 

