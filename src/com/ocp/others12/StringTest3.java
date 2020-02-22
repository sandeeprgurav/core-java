package com.ocp.others12;

public class StringTest3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Duke");
		String str1 = sb.toString();
		String str2 = sb.toString();
		System.out.println(str1==str2); //false
		
		String str11 = sb.toString();
		String str22 = str11;
		System.out.println(str11==str22); // true
	}
}

//Compilation fails due to error at line 4.


