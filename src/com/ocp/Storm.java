package com.ocp;

public class Storm {
	   public static void main(String... rain) throws Exception {
	      try (final AutoCloseable weatherTracker = new AutoCloseable() {
	         public void close() throws RuntimeException {}
	      }) {
	         System.out.println(weatherTracker.toString());
	      } catch (Exception e) {
	         //if(weatherTracker != null) {  weatherTracker scope is not accessible in catch
	         //   weatherTracker.close();
	         //}
	      } finally {
	    	  //weatherTracker.close();weatherTracker scope is not accessible in finally
	         System.out.println("Storm gone");
	      }
	   }
	}