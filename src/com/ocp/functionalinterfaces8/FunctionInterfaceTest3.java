package com.ocp.functionalinterfaces8;

interface Vehicle{
	public void ride(int speed);
}

public class FunctionInterfaceTest3 {
	public static void main(String[] args) {
		Vehicle v = new Vehicle() {
			public void ride(int speed) {
				System.out.println("Fly at "+ speed);				
			}
		};
		v.ride(100);
		
		Vehicle v1 = (int speed) -> System.out.println("Fly at "+speed);
		v1.ride(100);
		
		Vehicle v2 = speed -> System.out.println("Fly at "+speed);
		v2.ride(100);
		
		Vehicle v3 = (speed)-> System.out.println("Fly at "+speed);;
		v3.ride(100);
		
		
		
		//Vehicle v4 = int speed-> System.out.println("Fly at "+speed); //error at int
		//v4.ride(100);
	}
}

// Ans: Vehicle v1 = (int speed) -> System.out.println("Fly at "+speed);
