package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FirtsDuplicate {

	@SuppressWarnings("unused")
	private static int firstDuplicate(int[] a) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (!set.add(a[i])) {
				return a[i];
			}
		}
		return -1; // no duplicates found

	}
	
	static int firstDuplicate1(int[] a) {
	    Set<Integer> allItems = new HashSet<>();
		return Arrays.stream(a).filter(i -> !allItems.add(i)).findFirst().orElse(-1);
	}
	
	static int  firstDuplicate2(int[] a) { //need more changes
		  List <Integer> list = new ArrayList<>();
		    for(int i=0;i<a.length;i++) {
		        
		        for(int j=i+1;j<a.length;j++){
		            if(a[i] ==a[j]){
		                list.add(a[i]);
		            }
		        }
		        
		    }
		    
		    
		    if(list .size()>1){
		        return list.get(1);
		    } else if (list.size()==1){ 
		        return list.get(0);
		    } else{
		        return -1;
		    }
		    
		}

	public static void main(String[] args) {
		int[] a = {2, 1, 3, 5, 3, 2};

		System.out.println(firstDuplicate(a));
		System.out.println(firstDuplicate1(a));
		System.out.println(firstDuplicate2(a));
	}

}
