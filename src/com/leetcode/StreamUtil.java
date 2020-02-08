package com.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUtil {

	private static String[] upperCase(String[] array) {
		return Arrays.stream(array).map(x -> x.toUpperCase()).toArray(String[]::new);
	}

	private static String[] append(String[] array, String append) {
		return Arrays.stream(array).map(x -> x + " " + append).toArray(String[]::new);
	}

	private static String[] filter(String[] array, String filter) {
		return Arrays.stream(array).filter(x -> !x.equals(filter)).toArray(String[]::new);

	}

	private static List<String> filterToList(String[] array, String filter) {
		return Arrays.stream(array).filter(x -> !x.equals(filter)).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		String array[] = { "Rupesh", "Sai", "Pranj", "Sandeep", "Sam" };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(upperCase(array)));
		System.out.println(Arrays.toString(append(array, "Dev")));
		System.out.println(Arrays.toString(filter(array, "Sai")));
		System.out.println(filterToList(array, "Sandeep").toString());

		List<Person> persons = Arrays.asList(new Person("Sandeep", 33),
				                             new Person("Pranj", 30),
				                             new Person("Santosh", 40));

		Person filteredPerson = persons.stream() 
				.filter(x -> "Sandeep".equals(x.getName())) 
				.findAny() 
				.orElse(new Person("Unknown", 0));
		
		System.out.println(filteredPerson.toString());
		
		
		Person result2 = persons.stream()
                .filter(p -> {
                    if ("Pranj".equals(p.getName()) && 30 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);

        System.out.println(result2);
        
        String name = persons.stream()
                .filter(x -> "Sandeep".equals(x.getName()))
                .map(Person::getName)
                .findAny()
                .orElse("");

        System.out.println(name);
		
		
		

	}

}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
