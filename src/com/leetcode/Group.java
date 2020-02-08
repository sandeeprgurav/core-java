package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
	 public static List<List<Integer>> groupThePeople(int[] groupSizes) {
	        List<List<Integer>> res = new ArrayList<>();
	        Map<Integer, List<Integer>> sizeToGroup = new HashMap<>();
	        for (int i = 0; i < groupSizes.length; ++i) {
	            int sz = groupSizes[i];
	            sizeToGroup.computeIfAbsent(sz, l -> new ArrayList<>()).add(i);
	            if (sizeToGroup.get(sz).size() == sz) // the id list reaches their group size.
	                res.add(sizeToGroup.remove(sz)); // remove the id list from HashMap and add it to the solution.  
	        }
	        return res;        
	    }
	 
	 
	 public static void main(String[] args) {
		int[] array = {2,1,3,3,3,2};
		System.out.println(groupThePeople(array).toString());
		
	}
}
