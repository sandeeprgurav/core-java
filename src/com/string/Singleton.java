package com.string;

public class Singleton {

	private static Singleton singleInstance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleInstance == null)
			singleInstance = new Singleton();

		return singleInstance;
	}
}
