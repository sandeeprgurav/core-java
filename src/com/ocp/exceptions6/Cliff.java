package com.ocp.exceptions6;

final class FallenException extends Exception {}
final class HikingGear implements AutoCloseable {
   @Override public void close() throws Exception {
      throw new FallenException();
   }
}
public class Cliff {
   public final void climb() throws Exception {
      try (HikingGear gear = new HikingGear()) {
    	 System.out.println("asdad");  // e1
         throw new RuntimeException();   
         //Ans is Runtime Exception. 
      }
   }
   public static void main(String... rocks) {
      try {
         new Cliff().climb();
      } catch (Throwable t) {
         System.out.println(t);  // e1
      }
   }
}