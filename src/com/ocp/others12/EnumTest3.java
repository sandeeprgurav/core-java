package com.ocp.others12;

public enum EnumTest3 {
/*	TRUE(-10) {
		@Override
		String getNickName() {
			return"RIGHT";
		}
	},
	FALSE(-10) {
		public String getNickName() {
			return"WRONG";
		}
	},
	UNKNOWN(0) {
	@Override public String getNickName() { return "LOST"; }
	}
	private final int value;

	EnumTest3(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	protected abstract String getNickName();*/
}

// Ans: Two compilation errors  1. geName access modifer default instead or protected or public 2. ; after enum