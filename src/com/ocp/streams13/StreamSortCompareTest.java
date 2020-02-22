package com.ocp.streams13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortCompareTest {
	int vId;
	String vName;

	public StreamSortCompareTest(int vId, String vName) {
		super();
		this.vId = vId;
		this.vName = vName;
	}

	public int getvId() {
		return vId;
	}

	public String getvName() {
		return vName;
	}

	@Override
	public String toString() {
		return vName;
	}

	public static void main(String[] args) {
		List<StreamSortCompareTest> obj = Arrays.asList(new StreamSortCompareTest(2, "Car"),
				new StreamSortCompareTest(3, "Bike"), new StreamSortCompareTest(1, "Truck"));
		//obj.stream().sorted((v1, v2) -> Integer.compare(v1.getvId(), v2.getvId())) //correct		
		obj.stream().sorted(Comparator.comparing(v -> v.getvId()))//correct 		 
		//obj.stream().sorted((v1, v2) -> v1.getvId() < v2.getvId()) //wrong cant pass boolean condition should be int condition
		.forEach(System.out::print);
		
		//obj.stream().map (v -> v.getvId()).sorted ().forEach(System.out::print); This will print 1 2 3
	}
}

//Ans: .sorted((v1, v2) -> Integer.compare(v1.getvId(), v2.getvId())) 
//2.sorted(Comparator.comparing((StreamSortCompareTest v) -> v.getvId())) 
