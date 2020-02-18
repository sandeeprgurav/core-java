package com.ocp.others12;

class Tool {
	 void use() {System.out.println("Tool");}
}

public class InheritanceTest4 extends Tool {
	private void use(String s) {System.out.println("InheritanceTest4");}
	public void bang() {}
	
	public static void main(String[] args) {
		InheritanceTest4 objParent = new InheritanceTest4();
		objParent.use();
	}
}

// Ans: No compile error
