package com.ocp.streams13;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamOfTest {
public static void main(String[] args) {
	Set<String> set = new HashSet<>();
	set.add("tire-");
	List<String> list = new LinkedList<>();
	Deque<String> queue = new ArrayDeque<>();
	queue.push("wheel-");
	/*Stream.of(set, list, queue)
	.flatMap(x -> x)
	.forEach(System.out::print);*/
}
}

//Ans: The code does not compile.
