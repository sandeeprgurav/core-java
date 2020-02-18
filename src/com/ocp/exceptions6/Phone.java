package com.ocp.exceptions6;

class MissedCallException extends Exception {
}

public class Phone {
	static void makeCall() throws RuntimeException {
		throw new ArrayIndexOutOfBoundsException("Call");
	}

	public static void main(String[] messages) {
		/*try {
			makeCall();
		} catch (MissedCallException e) { //Unreacheable throw Exception
			throw new RuntimeException("Voicemail");
		} finally {
			throw new RuntimeException("Text");
		}*/
	}
}


//Ans: The code does not compile.