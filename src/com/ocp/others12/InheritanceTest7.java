package com.ocp.others12;

public class InheritanceTest7 {
	private int level = 1;

	class Deep {
		private int level = 2;

		class Deeper {
			private int level = 5;

			public void printReality() {
				System.out.print(level);
				System.out.print(" " + InheritanceTest7.Deep.this.level);
				System.out.print(" " + Deep.this.level);
			}
		}
	}

	public static void main(String[] bots) {
		InheritanceTest7.Deep.Deeper simulation = new InheritanceTest7().new Deep().new Deeper();
		simulation.printReality();
	}
}

// Ans: 5 2 2