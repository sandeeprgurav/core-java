package com.ocp.others12;

class Laptop extends InheritanceTest11 {
	public void startup() {
		System.out.print("laptop-");
	}
}

public class InheritanceTest11 {
	
	public void startup() {
		System.out.print("computer-");
	}

	public static void main(String[] args) {
		InheritanceTest11 computer = new Laptop();
		Laptop laptop = new Laptop();
		computer.startup();
		laptop.startup();
	}
	
	//Ans: laptop-laptop-
}