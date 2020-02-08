package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumProduct {

	static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
	}

	static int countSubstringsUtil(String pattern, char[] s) {
		int count = 0;
		Map<Character, Integer> mp = new HashMap<>();
		char [] patternArray = pattern.toCharArray();

		int n = s.length;

		int start = 0;

		for (int i = 0; i < n; i++) {
			if (mp.containsKey(s[i])) {
				mp.put(s[i], mp.get(s[i]) + 1);
			} else {
				mp.put(s[i], 1);
			}

			while (mp.containsKey('a') && mp.containsKey('e') && mp.containsKey('i') && mp.containsKey('o')
					&& mp.containsKey('u') && mp.containsKey('y') && mp.get('a') > 0 && mp.get('e') > 0 && mp.get('i') > 0 && mp.get('o') > 0
					&& mp.get('u') > 0 && mp.get('y') > 0) {
				for(int j =0;i<patternArray.length;i++) {
					
				}
				count += n - i;
				mp.put(s[start], mp.get(s[start]) - 1);

				start++;
			}
		}
		return count;
	}

	static int countSubstrings(String pattern, String s) {
		int count = 0;
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				temp += s.charAt(i);
			} else {
				if (temp.length() > 0)
					count += countSubstringsUtil(pattern, temp.toCharArray());
				temp = "";
			}
		}

		if (temp.length() > 0)
			count += countSubstringsUtil(pattern, temp.toCharArray());

		return count;
	}

	public static void main(String[] args) {
		String s = "aeouisddaaeeiouua";
		String pattern = "010";

		System.out.println(countSubstrings(pattern,s));
	}
}
