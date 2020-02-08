package com.leetcode;

public class GreatestCommonDivisor {
	public static int gcd(int p, int q) {
	    if (q == 0) return p;
	    else return gcd(q, p % q);
	}
	
	public static void main(String[] args) 
	{
	  int number1 = 40;
	  int number2 = 500;
	 
	  System.out.print( gcd(number1, number2) );
	}
}
