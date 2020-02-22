package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Person2 {
	private String name;

	public Person2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class StreamFlatMapTest3 {
	public static void main(String[] args) {
		Stream<List<Person2>> perStream = Stream.of(Arrays.asList(new Person2("Jack"), new Person2("Jane")),
				Arrays.asList(new Person2("Jhon")), Arrays.asList(new Person2("Tom"), new Person2("Tim")));
		Stream<Person2> persons = perStream.flatMap(personList -> personList.stream());
		persons.forEach(p -> System.out.print(p.getName() + " "));
	}
}

//Jack Jane Jhon Tom Tim  
//DBExam: An exception is thrown at runtime.



