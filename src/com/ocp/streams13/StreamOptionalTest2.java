package com.ocp.streams13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamOptionalTest2 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(5.4);
		list.add(1.2);
		Optional<Double> opt = list.stream().sorted().findFirst();
		System.out.println(opt.get() + " " + list.get(0));
	}
}

// Ans: 1.2 5.4
