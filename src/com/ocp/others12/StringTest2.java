package com.ocp.others12;

public class StringTest2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("1Z0");
		//sb.concat("-808"); concat is method of String not StringBuilder	 //line 4	
		sb.append("-808");
		System.out.println(sb);
	}
}

//Compilation fails due to error at line 4.


