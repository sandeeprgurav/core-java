package com.ocp.exceptions6;

import java.io.Closeable;
import java.io.IOException;

public class TryResourcesTest2 {
	 static class MyDatabase implements Closeable {
	      //public void close() throws SQLException { // Thows Exception should be IOException
	      public void close() throws IOException {
	         System.out.print("2");
	      }
	      public void write(String data) {}
	      public String read() {return null;}
	   }
	   public static void main(String... files) throws Exception {
	      try (MyDatabase myDb = new MyDatabase()) {
	         // TODO: Decide what to read/rite
	      } finally {
	         System.out.print("1");
	      }
	   }
}

//Ans: The code does not compile because of the MyDatabase class.
