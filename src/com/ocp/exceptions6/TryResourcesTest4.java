package com.ocp.exceptions6;

import java.io.Closeable;
import java.io.IOException;

public class TryResourcesTest4 {
	static class Walk implements AutoCloseable {
		@Override
		public void close()  {
			throw new RuntimeException("snow");
		}
	}
	
	static class Walk1 implements Closeable {
		@Override
		public void close() {
			throw new RuntimeException("snow");
		}
	}

	public static void main(String[] args) {
		try (Walk walk1 = new Walk(); Walk walk2 = new Walk();) {
			throw new RuntimeException("rain");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + e.getSuppressed().length);
		}
	}
}

//Ans:  rain2 