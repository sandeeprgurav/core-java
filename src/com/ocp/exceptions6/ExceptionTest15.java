package com.ocp.exceptions6;

import java.io.IOException;

public class ExceptionTest15 {
	public void turnOn() throws IOException {
	      new IOException("Not ready");
	   }
	   public static void main(String[] b) throws Exception {
	      try {
	         new ExceptionTest15().turnOn();
	      //} catch (RuntimeException b) {  // y1
	      } catch (NullPointerException a) {  // y1
	         System.out.println("sdadad");
	         throw new IOException();  // y2
	      } finally {
	         System.out.println("complete");
	      }
	   }
}

// Ans:The code does not compile because of line y1.


