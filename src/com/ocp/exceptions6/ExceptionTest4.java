package com.ocp.exceptions6;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Test12 {
	public void printFileContent() throws IOException {
		throw new IOException();
	}
}

public class ExceptionTest4  {
	public static void main(String[] args) throws Exception {		
		Test12 xObj = new Test12();
		xObj.printFileContent();
	}
}

// Ans: 1. Replace line 11 with public static void main (String [ ] args) throws Exception ( 2. Replace line 5 with public void printFileContent ( ) throws IOException (
// DBExam 1.  Replace line 11 with public static void main (String [ ] args) throws Exception ( 2. Replace line 7 with throw IOException ("Exception raised"); 

