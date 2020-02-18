package com.ocp.others12;

import java.util.ArrayList;
import java.util.List;

class Foo{
	public void methodB(String msg) {
		System.out.println("Foo +"+ msg);
	}
}
class Bar extends Foo{
	public void methodB(String msg) {
		System.out.println("Bar +"+ msg);
	}
}
class Baz extends Bar{
	public void methodB(String msg) {
		System.out.println("Baz +"+ msg);
	}
}

class Daze extends Baz{
	private Bar bb = new Bar();
	public void methodB(String msg) {
		bb.methodB(msg);
		super.methodB(msg);
	}
}



public class InheritanceTest9 {
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

//Ans:
// Bar Hello
//Baz Hello
