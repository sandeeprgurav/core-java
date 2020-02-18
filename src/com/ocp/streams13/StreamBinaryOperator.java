package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class StreamBinaryOperator {
	public static void main(String[] args) {
		List<String> qwords = Arrays.asList("why", "what", "when");
		BinaryOperator<String> operator = (s1, s2) -> s1.concat(s2);
		String sen = qwords.stream().reduce("Word:  ", operator);
		System.out.println(sen);

	}
}

//Word: why what when