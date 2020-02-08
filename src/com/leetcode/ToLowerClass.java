package com.leetcode;

public class ToLowerClass {
	public static String toLowerCase(String str) {
	    char[] chArr=str.toCharArray();
	    char[] lowerCase=new char[26];
	    
	   for(int i=97;i<=122;i++){
	        lowerCase[i-'a']=(char)i;	        
	    }
	    
	    for(int i=0;i<chArr.length;i++){
	        if(chArr[i]>=65&&chArr[i]<=90){
	            chArr[i]=lowerCase[chArr[i]-'A'];
	        }	        
	    }	    
	  return String.copyValueOf(chArr);	    
	}
	
	public static void main(String[] args) {
		System.out.println(toLowerCase("SANDEEP"));
	}
}
