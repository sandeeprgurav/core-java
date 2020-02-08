package com.ocp;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SteamBooleanTest {
public static void main(String[] args) {
	Stream<Boolean> bools = Stream.iterate(true,b->!b);
	//Map<Boolean, List<Boolean>> map = bools.limit(1).collect(partitioningBy(b->b));
	//System.out.println(map);
	//Ans: {false=[], true=[true]}
}

}
