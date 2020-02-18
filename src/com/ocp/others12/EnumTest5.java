package com.ocp.others12;

public enum EnumTest5 {
	TRUE(-10) {
		@Override
		// String getNickName() { return "RIGHT"; }}, access modifier was default, can
		// not reduce visibility scope.
		public String getNickName() {
			return "RIGHT";
		}
	},
	FALSE(-10) {
		public String getNickName() {
			return "WRONG";
		}
	},
	UNKNOWN(0) {
		@Override
		public String getNickName() {
			return "LOST";
		}
	}; // ; was missing
	private final int value;

	EnumTest5(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	protected abstract String getNickName();
}

// Ans: Two Compilation Error : TWO
