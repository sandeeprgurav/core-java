package com.ocp.streams13;

import java.util.Optional;

public class StreamOptionalTest {
	public static void main(String[] args) {

		String[] in = new String[3];
		System.out.println(Optional.of(in[2])); // NUllpointer exception occur on call of Optionl.of(null)
		String op1 = Optional.of(in[2]).orElse("Empty");
		System.out.println(op1);
	}
}


//Null Pointer Exception
