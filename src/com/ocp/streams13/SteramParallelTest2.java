package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;

public class SteramParallelTest2 {
	public String concat1(List<String> values) {
		return values.parallelStream().reduce(" a==>>", (x, y) -> x + y , (s1, s2) -> s1.concat(s2));
	}

	public String concat2(List<String> values) {
		return values.parallelStream().reduce((w, z) -> z + w).get();
	}

	public static void main(String... questions) {
		
		SteramParallelTest2 c = new SteramParallelTest2();
		List<String> list = Arrays.asList("Cat", "Hat");
		String x = c.concat1(list);
		String y = c.concat2(list);
		System.out.print(x + " " + y);
	}
}
// aCataHat HatCat
