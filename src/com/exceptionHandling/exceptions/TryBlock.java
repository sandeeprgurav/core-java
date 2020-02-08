package com.exceptionHandling.exceptions;

import java.io.IOException;
import java.io.StringWriter;

public class TryBlock {
	
	static void testTryBlock() {
		try (StringWriter writer = new StringWriter()) {
		    writer.write("Hello world!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		testTryBlock();
	}
}
