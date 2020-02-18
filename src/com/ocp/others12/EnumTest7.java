package com.ocp.others12;

interface HasHue {
	String getHue();
}

enum COLORS implements HasHue {
	red {
		public String getHue() {
			return "FF0000";
		}
	},
	green {
		public String getHue() {
			return "00FF00";
		}
	},
	blue {
		public String getHue() {
			return "0000FF";
		}
	}
}

class Book2 {
	static void main(String[] pencils) {
	}
}

final public class EnumTest7 extends Book2 {
	final void paint(COLORS c) {
		System.out.print("Painting: " + c.getHue());
	}

	final public static void main(String[] crayons) {
		new EnumTest7().paint(COLORS.green);
	}
}

//Painting: 00FF00
