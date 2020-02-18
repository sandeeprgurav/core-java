package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamListIterationTest {
	public static void main(String[] args) {
		List<Emp> li = Arrays.asList(new Emp("Sam", 20), new Emp("John", 60), new Emp("Jim", 51));
		Predicate<Emp> agVal = s -> s.getAge() > 50; // line n1
		li = li.stream().filter(agVal).collect(Collectors.toList());
		Stream<String> names = li.stream().map(Emp::getName);// line n2
		names.forEach(n -> System.out.print(n + " "));
	}
}

//Ans: John Jim

class Emp {
	private String name;
	private int age;

	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}