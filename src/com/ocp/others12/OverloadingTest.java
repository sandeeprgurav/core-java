package com.ocp.others12;

public class OverloadingTest {
	public static String doMsg(char x) {
		return "Good Day!";
	}

	public static String doMsg(int y) {
		return "Good Luck!";
	}

	public static void main(String[] args) {
		char x = 8;
		int z = '8';
		//System.out.println(x); //
		//System.out.println(z); //56
		System.out.println(doMsg(x));
		System.out.println(doMsg(z));
	}
}
//Ans : Good Day! Good Luck!