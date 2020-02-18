package com.ocp.streams13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

interface ApplyFilter {
	void filter(List<String> input);
}

public class StreamProcessTest {
	/*static Function<String,String> first = s ->
	{
		System.out.println(s);
		return s;
	};
	static Predicate second = t -> "bob".equalsIgnoreCase(t); // equalsIgnoteCase on object

	public void process(ApplyFilter a, List<String> list) {
		a.filter(list);
	}

	public static void main(String[] contestants) {
		final List<String> people = new ArrayList<>();
		people.add("Bob");
		people.add("bob");
		people.add("Jennifer");
		people.add("Samantha");
		final StreamProcessTest f = new StreamProcessTest();
		f.process(q -> {
			q.removeIf(second);
			q.forEach(first);
		}, people);
	}*/
}

//Ans: Two lines of code do not compile.
