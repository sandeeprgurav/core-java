package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodReferenceTest2 {
	List<String> list = null;

	public void printValues() {
		System.out.println(getList());
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public static void main(String[] args) {
		List<String> i = Arrays.asList("Dog", "Cat", "Mouse");
		StreamMethodReferenceTest2 obj = new StreamMethodReferenceTest2();
		obj.setList(i.stream().collect(Collectors.toList()));
		// obj.getList().forEach(StreamMethodReferenceTest2::printValues);; compile
		// error on StreamMethodReferenceTest2::printValues
		//obj.getList().forEach(k-> obj.printValues(k));; if printValues takes String param 
	}

}
// Ans : Compilation error occurs
