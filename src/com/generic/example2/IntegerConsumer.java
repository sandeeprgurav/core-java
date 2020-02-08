package com.generic.example2;

public class IntegerConsumer implements Consumer<Integer> {
    public void consume(Integer parameter) {
    	
    }
    
    public static <T> T returnType(T argument) { 
        return argument; 
    }
    
    public static void main(String[] args) {
    	Integer inferredInteger = returnType(1);
    	String inferredString = returnType("String");
    	System.out.println(inferredInteger);
    	System.out.println(inferredString);
    	
	}
}
