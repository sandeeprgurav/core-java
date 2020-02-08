package com.leetcode;

public class ThreeHigestNUmberInDescendingOrder {
	
	public static void main(String[] args) {
	
		int [] array = {2,5,7,9,1,4};
		int temp=0;
		for(int i =0; i<array.length;i++) {
			for(int j=1;j<array.length-1;j++) {
			   if(array[j-1]<array[j]) {
				   temp =array[j-1];
				   array[j-1] =array[j];
				   array[j] = temp;
			   }
			}
		}
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
	}
	

}
