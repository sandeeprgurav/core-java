package com.ocp.exceptions6;

class UserException extends Exception {
}

class AgeOutOfLimitException extends UserException {
}

public class ExceptionTest7 {
	public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
		if (name.length() < 6) {
			throw new UserException();
		} else if (age >= 60) {
			throw new AgeOutOfLimitException();
		} else {
			System.out.println("User is registered.");
		}
	}

	public static void main(String[] args) throws UserException {
		ExceptionTest7 t = new ExceptionTest7();
		t.doRegister("Mathew", 60);
	}
}

// Ans: An AgeOutOfLimitException is thrown.
