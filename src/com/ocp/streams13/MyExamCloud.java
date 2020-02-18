package com.ocp.streams13;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Stream;

public class MyExamCloud {
	public static void main(String[] args) {
		LocalDate ld0 = LocalDate.of(2015, 1, 27);
		LocalDate ld1 = LocalDate.of(2015, 1, 31);
		Duration due = Duration.between(ld0, ld1);
		System.out.println(due);
		
		//java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
		
		
		Stream ints = Stream.of(1,2,3);
		//int i = ints.skip(1).limit(1).count(); compile time error type imstahc from long to int
		long i = ints.skip(1).limit(1).count();
		System.out.println(i);
		
		/*Stream<String> s = Stream.of("speak", "bark", "meow", "growl");
		Map<Integer, String> map = s.collect(toMap(String::length,kâ€�>k));  ?? didnt understand //Ans is The code compiles but throws exception at runtime 		
		System.out.println(map.size() + " " + map.get(4));*/
		
	}
}
