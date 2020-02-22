package com.ocp.localization11;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

/*public class PropertyCounter extends ListResourceBundle {
	   private int count = 0;
	   @Override
	   protected Object[][] getContents() {
	      return new Object[][] {{ "count", new PropertyCounter() }};
	   }
	   public int getCount() {
	      return count++;
	   }
	   public static void main(String[] args) {
	      ResourceBundle rb = ResourceBundle.getBundle("com.ocp.localization11.PropertyCounter");
	      PropertyCounter obj = (PropertyCounter) rb.getObject("count");
	      System.out.println(obj.getCount() + " " + obj.getCount());
	      	      
	   }
	}*/

//Ans: 0 1   // no Exception handling needed, package name is a trick

 public class PropertyCounter extends ListResourceBundle {
	   private int count = 0;
	 
	   @Override
	   protected Object[][] getContents() {
	      return new Object[][] { { "count", count++ } };
	   }
	   public static void main (String [] as) {
	      ResourceBundle rb = ResourceBundle.getBundle("com.ocp.localization11.PropertyCounter");
	      System.out.println(rb.getObject("count") + " " + rb.getObject("count"));
	   }
	}
 
//Ans: 0 0   // no Exception handling needed, package name is a trick