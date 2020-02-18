package com.ocp.functionalinterfaces8;

import java.util.function.UnaryOperator;

public class UnaryOPeratorTest {
	public static void main(String[] args) {
		final String str1 = "Java";
		StringBuffer strBuff = new StringBuffer("Course");
		UnaryOperator<String> u = (str2) -> str1.concat(str2);
		UnaryOperator<String> c = (str3) -> str3.toLowerCase();
		//System.out.println(u.apply(c.apply(strBuff))); apply method requires string value not string buffer  
		System.out.println(u.apply(c.apply(strBuff.toString()))); // output Javacourse
	}
}


//Ans:A compilation error occurs at line n2.
//DbExam:A compilation error occurs at line n1.