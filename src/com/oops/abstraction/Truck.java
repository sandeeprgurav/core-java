package com.oops.abstraction;

public class Truck implements Vehicle {

	@Override
	public void wheelsFunction() {
         System.out.println("Truc wheels functioning will be coded here");		
	}

	@Override
	public void steeringFunction() {
        System.out.println("Truck steering functioning will be coded here");		
	}

	@Override
	public void breakFunction() {
		System.out.println("Truck break functioning will be coded here");		
	}

	@Override
	public void accelerateFunction() {
		System.out.println("Truck accelerate functioning will be coded here");		
	}

	@Override
	public void fuelCosumptionFunction() {
		System.out.println("Truck fuel consumption functioning will be coded here");		
	}

}
