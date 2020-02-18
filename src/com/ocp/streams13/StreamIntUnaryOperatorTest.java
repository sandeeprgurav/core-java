package com.ocp.streams13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class StreamIntUnaryOperatorTest {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(200);
		UnaryOperator<Integer> funInt = n -> n * 5;
		nums.replaceAll(funInt);
		System.out.println(nums);
	}
}

/*[500, 1000]*/
