package com.ocp.streams13;

import java.util.Arrays;
import java.util.List;

public class StreamPeek2 {
	public static void main(String[] args) {
       List<Integer> prices = Arrays.asList(3,4,5);
       prices.stream().filter(e-> e> 4 )
       .peek(System.out::println) //line 1
       .map(z-> z-1). //lin2
       forEach(System.out::println); //line n3
	}
}


//Replace line n3 with .forEach (n -> System.out.println ("New Price" + n));

/*Options: 1.Replace line n2 with .mapToInt (n -> n – 1);
2. Replace line n3 with .forEach (n -> System.out.println ("New Price" + n));
3.Replace line n1 with .forEach (e -> System.out.print ("Price" + e))
4. Replace line n2 with .map (n -> System.out.println ("New Price" + n -1)) and remove line n3
*/


