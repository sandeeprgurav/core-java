package com.ocp.file7;

import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.Files.*;
import java.io.*;
import java.nio.file.*;

public class FileTest2 {
	private int numPassengers = 1;
	   private transient String schedule = "NONE";
	   {numPassengers = 2;}
	   public FileTest2() {
	      this.numPassengers = 3;
	      this.schedule = "Tropical Island";
	   }
	   public static void main(String... passengers) throws Exception {
	      try (ObjectOutputStream o = new ObjectOutputStream(
	            new FileOutputStream("ship.txt"))) {
	    	  FileTest2 c = new FileTest2();
	         c.numPassengers = 4;
	         c.schedule = "Casino";
	         o.writeObject(c);
	      }
	      try (ObjectInputStream i = new ObjectInputStream(
	            new FileInputStream("ship.txt"))) {
	    	  //FileTest2 c = i.readObject(); cant convert Object to FileTest2
	    	  FileTest2 c = (FileTest2) i.readObject();
	         System.out.print(c.numPassengers+","+c.schedule);
	      }
	   }
}

// Ans: The class does not compile.