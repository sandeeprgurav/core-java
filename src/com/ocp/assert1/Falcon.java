package com.ocp.assert1;
// Notes : https://www.baeldung.com/java-assert
public class Falcon extends Exception {
	   private int parsec = 12;
	   public Falcon(String name) {
	      super(name);
	   }
	   public static void main(String[] aluminum) {
	      assert new Falcon(null).parsec<12;
	   }
	}

//Ans: java -da -ea:Falcon Falcon