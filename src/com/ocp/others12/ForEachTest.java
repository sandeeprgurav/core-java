package com.ocp.others12;

public class ForEachTest {

	public static void main(String[] args) {
		int[] x = { 6, 7, 8 };
		for (int i : x) {
			// i++; i will increment and print
			System.out.print(i);
			i++;							
		}
	}
}

// Ignore the increment operation and print 6 7 8