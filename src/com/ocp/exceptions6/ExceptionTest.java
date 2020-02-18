package com.ocp.exceptions6;

import java.io.IOException;

public class ExceptionTest {
public static void main(String[] args) {
	try {
		throw new IOException();
		} catch ( IOException | RuntimeException e) { }
	
}
}

// Ans:IOException | RuntimeException e 
