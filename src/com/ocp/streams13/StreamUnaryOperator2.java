package com.ocp.streams13;

import java.util.function.UnaryOperator;

public class StreamUnaryOperator2 {
	private int layer;

	public StreamUnaryOperator2(int layer) {
		super();
		this.layer = layer;
	}

	public static void open(UnaryOperator<StreamUnaryOperator2> task, StreamUnaryOperator2 obj) {
		while ((obj = task.apply(obj)) != null) {
			// while((obj = task.accept(obj)) != null) {
			System.out.print("X");
		}
	}

	public static void main(String[] wood) {
		open(s -> {
			if (s.layer <= 0)
				return null;
			else
				return new StreamUnaryOperator2(s.layer);
		}, new StreamUnaryOperator2(5));
	}
}

// UnaryOperator has apply method not accept, accpet is there in Consumer.
// Compile time error at line 14 
