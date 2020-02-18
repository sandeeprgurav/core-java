package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class StreamUnaryOperator {
 public static void main(String[] args) {
	 UnaryOperator<Integer> uo1 = s -> s*2;//line n1
	 List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
	 //loanValues.stream().filter(lv->lv >= 1500).map(lv->uo1.apply(lv)) // map accpet Function interface not UnaryOperator 
	 loanValues.stream().filter(lv->lv >= 1500).map(lv->lv*2)
	 .forEach(s -> System.out.print(s + " "));
	 	 	
}
}

// A compilation error occurs at line n2.