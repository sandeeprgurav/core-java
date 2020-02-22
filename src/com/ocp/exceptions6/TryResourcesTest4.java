package com.ocp.exceptions6;

import java.io.Closeable;
import java.io.IOException;

public class TryResourcesTest4 {
	static class Walk implements AutoCloseable {
		@Override
		public void close()  {
			//System.out.println("Walk");
			throw new RuntimeException("snow");
		}
	}
	
	static class Walk1 implements Closeable {
		@Override
		public void close() {
			//System.out.println("Walk1");
			throw new RuntimeException("snow");
		}
	}

	public static void main(String[] args) {
		try (Walk walk1 = new Walk(); Walk1 walk2 = new Walk1();) {
			throw new RuntimeException("rain");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + e.getSuppressed().length);
		}
	}
}

//Ans:  rain2 