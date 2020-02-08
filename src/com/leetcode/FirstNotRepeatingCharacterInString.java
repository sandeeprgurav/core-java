package com.leetcode;

public class FirstNotRepeatingCharacterInString {

	static char firstNotRepeatingCharacter1(String s) {
		for (int i = 0; i < s.length(); i++) {
			char charValue = s.charAt(i);
			if (s.indexOf(charValue) == s.lastIndexOf(charValue)) {
				return charValue;
			}
		}
		return '-';
	}

	public static void main(String[] args) {
		String s = "abacabaabaaba";
		System.out.println(firstNotRepeatingCharacter1(s));
	}
}
