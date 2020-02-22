package com.ocp.exceptions6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest17 {
	public int play(String dogName) throws Exception {
	      try {
	         throw new RuntimeException(dogName);
	      } catch (Exception e) {
	         throw new RuntimeException(e);
	      }
	   }
	//public static final void main(String[] ball) throws RuntimeException {  // It was RuntimeException instead of Exception
	public static final void main(String[] ball) throws Exception { 
	      new ExceptionTest17().play("Webby");
	      new ExceptionTest17().play("Georgette");
	   }
}

// Ans:The class does not compile because of the main() method.


