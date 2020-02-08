package com.oops.abstraction;

public class Auto implements Vehicle {

	@Override
	public void wheelsFunction() {
         System.out.println("Auto wheels functioning will be coded here");		
	}

	@Override
	public void steeringFunction() {
        System.out.println("Auto steering functioning will be coded here");		
	}

	@Override
	public void breakFunction() {
		System.out.println("Auto break functioning will be coded here");		
	}

	@Override
	public void accelerateFunction() {
		System.out.println("Auto accelerate functioning will be coded here");		
	}

	@Override
	public void fuelCosumptionFunction() {
		System.out.println("Auto fuel consumption functioning will be coded here");		
	}
}
