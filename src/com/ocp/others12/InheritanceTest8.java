package com.ocp.others12;

import java.util.ArrayList;
import java.util.List;

class Alpha1 {
	public String doStuff(String msg) {
		return msg;
	}
}
class Beta extends Alpha1 {
	public String doStuff(String msg) {
		return msg.replace('a', 'e');
	}
}

class Gamma extends Beta{
	public String doStuff(String msg) {
		return msg.substring(2);
	}
}

public class InheritanceTest8 {
	public static void main(String[] bots) {
		List<Alpha1> list = new ArrayList<Alpha1>();
		list.add(new Alpha1());
		list.add(new Beta());
		list.add(new Gamma());
		for(Alpha1 t: list) {
			System.out.println(t.doStuff("Java"));			
		}		
		
	}
}

// Java Jeve va
