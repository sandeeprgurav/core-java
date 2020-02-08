package com.string;

public class CustomStringMain {

	public static void main(String[] args) {

		CustomString str2 = new CustomString('R');
		str2.setAt(1, 'A');
		str2.setAt(2, 'M');
		str2.setAt(3, 'E');
		str2.setAt(4, 'S');
		str2.myLineDisplay();
		CustomString str = new CustomString(str2);
		System.out.println(str.myCharAt(0));
		str.myLineDisplay();
		System.out.println(str.myLength());
		char[] myToArray = str.myToCharArray();
		System.out.println(myToArray);
		str = str.myConcat(str2);
		str.myLineDisplay();
		System.out.println(str.myLength());
		CustomString substr = str.mySubString(0, 3);
		substr.myLineDisplay();
	}
}
