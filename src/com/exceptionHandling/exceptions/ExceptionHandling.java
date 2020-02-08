package com.exceptionHandling.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionHandling {

	public static void main(String[] args) {
       //Exception NullPointerException, FileNotFoundException, IndexBooundException, 
		
		try {
			String [] array = new String[3];
			array[4]="Sandeep";						
		} catch(ArrayIndexOutOfBoundsException e) {			
			System.out.println("This is because value assigned for wrong index");
		} catch(NullPointerException e) {
			System.out.println("Value assign to null array");
		} catch(Exception e) {
			System.out.println("Something went wrong");
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			System.out.println(exceptionAsString);
		}

	}

}
