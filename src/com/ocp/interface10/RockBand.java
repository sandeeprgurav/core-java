package com.ocp.interface10;

interface DoubleBass {
	   void strum();
	   default int getVolume() {return 5;}
	}
	interface BassGuitar {
	   void strum();
	   default int getVolume() {return 10;}
	}
	class ElectricBass implements DoubleBass, BassGuitar {
		// Need to override the method below else will get cimpile error
	   public int getVolume() {return 10;}
	   @Override public void strum() {System.out.print("A");}
	}
	public class RockBand {
	   public static void main(String[] strings) {		   		   
	      final class MyElectricBass extends ElectricBass {
	         public void strum() {System.out.print("E");}
	      }
	   }
	}
//Ans: One line of code does not compile.

