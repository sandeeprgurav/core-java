package com.ocp.streams13;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamTest {
public static void main(String[] args) {
	//IntegerStream pages = IntegerStream.of(200, 300); There is no class IntegerStream exist 
	IntStream pages = IntStream.of(200, 300);
	         IntSummaryStatistics stats = pages.summaryStatistics();
	         long total = stats.getSum();
	         long count = stats.getCount();
	        System.out.println(total + "-" + count);
}
}

// compile time error 

