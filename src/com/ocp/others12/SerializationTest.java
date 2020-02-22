package com.ocp.others12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationTest implements Serializable{
	private int chambers = -1;
	   private transient Double size = null;
	   private static String color;
	   public SerializationTest() {
	      this.chambers = 3;
	      color = "BLUE";
	   }
	 
	   public static void main(String[] love) throws Throwable {
	      try (ObjectOutputStream o = new ObjectOutputStream(
	            new FileOutputStream("scan.txt"))) {
	         final SerializationTest v = new SerializationTest();
	         v.chambers = 2;
	         v.size = 10.0;
	         v.color = "RED";
	         o.writeObject(v);
	      }
	      new SerializationTest();
	      try (ObjectInputStream o = new ObjectInputStream(
	            new FileInputStream("scan.txt"))) {
	    	  SerializationTest v = (SerializationTest)o.readObject();
	         System.out.print(v.chambers+","+v.size+","+v.color);
	      }
	   }
	   { chambers = 4; }
}

//Ans: 2,null,BLUE
