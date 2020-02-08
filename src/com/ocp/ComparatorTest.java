package com.ocp;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest implements Comparator<String> {
	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase());
	}

	public static void main(String[] args) {
		String[] values = { "123", "Abb", "aab" };
		Arrays.sort(values, new ComparatorTest());
		for (String s : values)
			System.out.print(s + " ");
	}
}

//Ans: 	Abb aab 123