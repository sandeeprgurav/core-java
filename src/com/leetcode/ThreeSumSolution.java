package com.leetcode;

import java.util.ArrayList;
import java.util.List;

class ThreeSumSolution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> finalResult = new ArrayList<List<Integer>>();       
       
       for(int i=0; i<=nums.length-2; i++) {
    	   for(int j =i+1;j<=nums.length-1;j++) {
	    		 for(int k =j+1;k<=nums.length-1;k++) {  
		           if((nums[i] + nums[j] + nums[k]) == 0 ){
		        	   List<Integer> list = new ArrayList<>();
		        	   list.add(nums[i]);
		        	   list.add(nums[j]);
		        	   list.add(nums[k]);
		        	   if(checkUniqueness(finalResult, i, j, k)) {
		        		   finalResult.add(list);
		        	   }
	    		  }
	    	   }
	       }
       }
        return finalResult;
    }
          
	//1,-1,0
	//1,0,-1
	
    private boolean checkUniqueness(List<List<Integer>> finalResult, int i, int j, int k) {
    	int counter =0;
        for(List<Integer> list:finalResult) {
        	for(int value:list) {
        		if(value== i||value ==j ||value ==k) {
        			counter++;
        		}
        	}        	
        }
        if(counter==3) {
        	return false;
        }
		return true;
	}



	public static void main(String[] args) {
        //int[] result = twoSum(new int[]{2,7,11,15}, 9);
        //System.out.println(result.toString());        
    }
    
    
}