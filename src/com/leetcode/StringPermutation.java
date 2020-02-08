package com.leetcode;

public class StringPermutation {

	public static void main(String[] args) {
		String input = "abc";
		int length = input.length();
		permutation(input, 0, length - 1);
	}

	static void permutation(String str, int start, int end) {
		if (start == end) {
			System.out.println(str);
		} else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				permutation(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
	}

	private static String swap(String str, int start, int end) {
		char temp;
		char[] array = str.toCharArray();
		temp = array[start];
		array[start] = array[end];
		array[end] = temp;

		return String.valueOf(array);
	}
}
