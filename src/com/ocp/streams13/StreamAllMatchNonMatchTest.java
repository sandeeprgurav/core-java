package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;

public class StreamAllMatchNonMatchTest {
	public static void main(String[] args) {
    List<Integer> nums= Arrays.asList(10,20,10,20,20);
    
    boolean b = nums.stream().filter(n->n==20).allMatch(n->n==20);
    System.out.println(b);
    
    /*b = nums.stream().filter(n->n==20).noneMatch(n->n==20);
    
    System.out.println(b);*/
    //true
    
    b = nums.stream().map(n->20).noneMatch(n->n==10);
    
    System.out.println(b);
    //true
    
	}
}

/* Ans: boolean b = nums.stream()
.filter(n -> n == 20)
.allMatch(n -> n == 20);

boolean b = nums.stream()
.map(n -> 20)
.noneMatch(n -> n == 10);
*/