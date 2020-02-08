package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PojoSortingMain {
	
  public static void main(String[] args) {
	  
	  List<Pojo> list = new ArrayList<>();
	  list.add(new Pojo("Sandeep", 31, "Gurav"));
	  list.add(new Pojo("Vikas", 32, "Kamat"));
	  list.add(new Pojo("Yatin", 33, "Madan"));
	  list.add(new Pojo("Pranjali", 31, "Yadav"));
	  list.add(new Pojo("Suresh", 36, "Chavan"));
	  	  
	  Collections.sort(list, Collections.reverseOrder()); 
	  
  }
  
}
