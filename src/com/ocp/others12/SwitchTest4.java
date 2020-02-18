package com.ocp.others12;

enum DaysOff {
	   Thanksgiving, PresidentsDay, ValentinesDay
	}

public class SwitchTest4 {
	
	public static void main(String[] args) {
		   final DaysOff input = DaysOff.Thanksgiving;
		      switch(input) {
		         default:
		         //case DaysOff.ValentinesDay: // access directly enum in switch block
		         case ValentinesDay:
		            System.out.print("1");
		         case PresidentsDay:
		            System.out.print("2");
		      }
		   }
}

// Ans: Compile time error
