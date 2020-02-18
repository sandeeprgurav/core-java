package com.ocp.streams13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamReduceTest {
	void reduceList(List<String> names, Predicate<String> tester) {
	      names.removeIf(tester);
	   }
	   public static void main(String[] treats) {
	      int MAX_LENGTH = 2;
	      StreamReduceTest search = new StreamReduceTest();
	      List<String> names = new ArrayList<>();
	      names.add("Lassie");
	      names.add("Benji");
	      names.add("Brian");
	      MAX_LENGTH += names.size();
	      search.reduceList(names, d -> d.length()>5/*MAX_LENGTH*/); // Passed local variable should be final MAX_LENGTH  
	      System.out.print(names.size());
	   }
}

//Ans: The code does not compile because of lambda expression.
