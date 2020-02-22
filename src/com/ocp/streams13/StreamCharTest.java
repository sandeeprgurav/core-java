package com.ocp.streams13;

import java.util.stream.Stream;

public class StreamCharTest {
 public static void main(String[] args) {
	 Stream<Character> stream = Stream.of('c', 'b', 'a', 'd','e','f','k','l'); // z1
	 stream.sorted().findAny().ifPresent(System.out::println); // z2 ==>> It can print any single character of a, b, or c.
	  
	 Stream<Character> stream1 = Stream.of('c', 'b', 'a');
	 System.out.println(stream1.sorted().findFirst());  // This will print Optional[a]
	 System.out.println(stream1.sorted().findFirst().get());  // This will print a
	 System.out.println(stream1.sorted().findFirst().orElse('z'));  // This will print a else z if no element
	 stream1.sorted().findFirst().ifPresent(System.out::println); // This will preing a always 
	 
	 /*Options
	 1. It is guaranteed to print
	 the single character a. 2. It can print any single character of a, b, or c.
	 3. None of the above 4. The code does not compile. ==>> 3*/
}
}
