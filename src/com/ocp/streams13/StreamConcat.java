package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;

public class StreamConcat {

	public static void main(String[] args) {
		List<String> nums = Arrays.asList("EE", "SE");
		String ans = nums.parallelStream().reduce("Java ", (a,b)-> a.concat(b));//JavaEEJavaSE
		//String ans = nums.stream().reduce("Java ", (a,b)-> a.concat(b)); //Java EESE
		System.out.println(ans);
	}
}

//Ans: JavaEEJavaSE

