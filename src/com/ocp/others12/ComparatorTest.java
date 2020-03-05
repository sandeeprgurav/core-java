package com.ocp.others12;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest implements Comparator<String> {
	public int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase()); // Abb aab 123
		//return b.compareTo(a); // aab Abb 123 
	}
	
	public static void main(String[] args) {
		String[] values = { "123", "Aab", "aab" };
					
		System.out.println("Abb".hashCode());
		System.out.println("aab".hashCode());
		Arrays.sort(values, new ComparatorTest());
		for (String s : values)
			System.out.print(s + " ");
	}
}

//Ans: 	Abb aab 123