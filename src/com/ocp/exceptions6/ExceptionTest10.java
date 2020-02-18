package com.ocp.exceptions6;

public class ExceptionTest10 {
	static class SneezeException extends Exception {
	}

	static class SniffleException extends SneezeException {
	}

public static void main(String[] args) throws SneezeException {
try {
throw new SneezeException();
} catch (SneezeException e) {
 //e = new Exception();
throw e;
} }
}