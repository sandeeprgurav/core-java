package com.ocp.collections2;

import java.util.ArrayDeque;

public class ArrayDequeTest4 {
	public static void main(String[] args) {
		ArrayDeque<Integer> dice = new ArrayDeque<>();
		dice.offer(3);
		dice.offer(2);
		dice.offer(4);
		System.out.print(dice.stream().filter(n -> n != 4));
		
		
	}
}
/*Options:
1.  None of the above
2. The code does not compile.
3. 2
4. 3*/
// java.util.stream.ReferencePipeline$2@816f27d
//Ans : None of the above