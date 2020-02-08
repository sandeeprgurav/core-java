package com.ocp;

interface DoubleBass {
	   void strum();
	   default int getVolume() {return 5;}
	}
	interface BassGuitar {
	   void strum();
	   default int getVolume() {return 10;}
	}
	class ElectricBass implements DoubleBass, BassGuitar {
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
