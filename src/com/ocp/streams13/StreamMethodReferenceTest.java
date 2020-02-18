package com.ocp.streams13;

import java.io.FileNotFoundException;

public class StreamMethodReferenceTest {

	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}

	public static void main(String[] args) {
		StreamMethodReferenceTest.printException(new Exception("B"));
		StreamMethodReferenceTest.printException(new FileNotFoundException("A"));		
		StreamMethodReferenceTest.<NullPointerException>printException(new NullPointerException ("D"));
		
		//StreamMethodReferenceTest.<Throwable>printException(new Exception("C"));		
		//StreamMethodReferenceTest.printException(new Throwable("E"));
	}

}

// Ans : All above three options are correct
