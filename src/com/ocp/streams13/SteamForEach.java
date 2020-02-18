package com.ocp.streams13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SteamForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Archie");
		list.add("X-Men");

		list.stream().forEach(s -> System.out.println(s));
		list.stream().forEach(s -> System.out.println(s));
	}
}
/*Archie
X-Men
Archie
X-Men
*/