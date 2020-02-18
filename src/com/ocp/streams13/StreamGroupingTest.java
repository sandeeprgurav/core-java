package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGroupingTest {
	String course, name, city;

	public StreamGroupingTest(String name, String course, String city) {
		super();
		this.name = name;
		this.course = course;
		this.city = city;
	}

	public String getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public static void main(String[] args) {
		List<StreamGroupingTest> list = Arrays.asList(new StreamGroupingTest("Jessy", "Java ME", "Chicago"),
				new StreamGroupingTest("Helen", "Java EE", "Houston"),
				new StreamGroupingTest("Mark", "Java ME", "Chicago"));
		list.stream().collect(Collectors.groupingBy(StreamGroupingTest::getCourse))
				.forEach((src, res) -> System.out.println(src));
	}
}

// Ans: Java EE
// Java ME
