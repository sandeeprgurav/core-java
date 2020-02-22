package com.ocp.others12;

public class InheritanceTest17 {
	static class Browser {
		public void go() {
			System.out.println("Inside Browser");
		}
	}

	static class Firefox extends Browser {
		public void go() {
			System.out.println("Inside Firefox");
		}
	}

	static class IE extends Browser {
		@Override
		public void go() {
			System.out.println("Inside IE");
		}
	}

	public static void main(String[] args) {
		Browser b = new Firefox();
		IE e = (IE) b; // Clast cast Exception at runtime. 
		e.go();
	}
}

// Ans: A runtime exception is thrown.


