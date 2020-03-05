package com.ocp.exceptions6;

public class ExceptionTest9 {
	static class SneezeException extends Exception {
	}

	static class SniffleException extends SneezeException {
	}

	public static void main(String[] args) throws SneezeException {
		try {
			throw new SneezeException();
		}
			 /*catch (SneezeException | SniffleException e) { //subclass and superclass should not be together

		}*/ catch (SneezeException e) {

			throw e;
		}
	}
}

// Ans: None of the above; the code does not compile.
