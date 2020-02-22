package com.ocp.exceptions6;

class TimeException1 extends Exception {
}

class TimeMachine implements AutoCloseable {
	int v;

	public TimeMachine(int v) {
		this.v = v;
	}

	public void close() throws Exception {
		System.out.print(v);
	}
}

public class ExceptionTest14 {
	public static void main(String[] twelve) throws Exception { //throws Exception either catch or throw Exception of close
		try (TimeMachine timeSled = new TimeMachine(1);
				TimeMachine delorean = new TimeMachine(2);
				TimeMachine tardis = new TimeMachine(3)) {
		} catch (TimeException1 e) {
			System.out.print(4);
		} finally {
			System.out.print(5);
		}
	}

}

// Ans:The code does not compile.


