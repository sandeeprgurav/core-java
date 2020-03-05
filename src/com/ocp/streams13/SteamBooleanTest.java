package com.ocp.streams13;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.partitioningBy;
import java.util.stream.Stream;

public class SteamBooleanTest {
public static void main(String[] args) {
	Stream<Boolean> bools = Stream.iterate(false,b->!b);
	Map<Boolean, List<Boolean>> map = bools.limit(1).collect(partitioningBy(b->b));
	System.out.println(map);
	
	
}

}

//Ans: {false=[], true=[true]}
