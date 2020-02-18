package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class TechName {
	String techName;

	TechName(String techName) {
		this.techName = techName;
	}

	public static void main(String[] args) {
		List<TechName> tech = Arrays.asList(new TechName("Java-"), new TechName("Oracle DB-"), new TechName("J2EE-"));
		Stream<TechName> stre = tech.stream();
		stre.map(x->x.techName).forEach(System.out::print);  
		//stre.forEach(System.out::print); This will print objects 		
	}
}

//Ans: stre.map(a-> a.techName).forEach(System.out::print);