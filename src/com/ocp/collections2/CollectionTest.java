package com.ocp.collections2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class CollectionTest {
public static void main(String[] args) {
	List objects= new ArrayList();
	HashSet<? super ClassCastException> set = new HashSet<Exception>();
	ArrayList<? super Date> list1 = new ArrayList<Date>();
	List<String> list2 = new Vector<String>();	
	List<?> list3= new ArrayList<String>();
	//List<?> list1 = new ArrayList<?>(); compile error
	
			
}
}
