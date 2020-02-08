package com.ocp;

public class DataIntegrity {
	private int score;

	public DataIntegrity() {
		super();
		DataIntegrity.this.score = 5;
	}

	public static void main(String[] books) {
		final DataIntegrity johnny5 = new DataIntegrity();
		assert (johnny5.score > 2) : johnny5.score++;
		//assert johnny5.score >= 5 : System.out.print("No input"); Compile error here , must return some value
		
		
		System.out.print("Made it!");
	}
}

//Ans :The code does not compile.