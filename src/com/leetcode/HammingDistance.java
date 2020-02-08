package com.leetcode;

public class HammingDistance {
	/*
	 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

		Given two integers x and y, calculate the Hamming distance.
		
	    Input: x = 1, y = 4

		Output: 2

		Explanation:
		1   (0 0 0 1)
		4   (0 1 0 0)
		       ↑   ↑

		The above arrows point to positions where the corresponding bits are different.*/

	static StringBuilder binaryValue = new StringBuilder();
	
	public static int hammingDistance(int x, int y) {
		bin(x);
		String xBinaryValue = binaryValue.toString();
		binaryValue = new StringBuilder();
		bin(y);
		String yBinaryValue = binaryValue.toString();		

		int counter = 0, length = Math.max(xBinaryValue.length(), yBinaryValue.length()) ;
		xBinaryValue = getFormattedString(length,xBinaryValue);
		yBinaryValue = getFormattedString(length,yBinaryValue);
		
		System.out.println("xBinaryValue ==>"+xBinaryValue);
		System.out.println("yBinaryValue ==>"+yBinaryValue);
		
		for (int i = 0; i < length; i++) {
			if (Integer.parseInt(xBinaryValue.charAt(i) + "") != Integer.parseInt(yBinaryValue.charAt(i) + "")) {
				counter++;
			}
		}

		return counter;

	}
	
	static String getFormattedString(int length, String value ) {
		String str = String.format("%"+length+"s",value);
		str = str.replace(' ','0');
		return str;
	}
	
	static void bin(int n) {
		if (n > 1)
			bin(n / 2);

		binaryValue.append(n % 2);
	}

	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 14));
	}
}
