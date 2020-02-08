package com.oops.abstraction;

public abstract class Car {

    public void wheelsFunction () {
       System.out.println("Functioning of wheel coded here");	
    }
    
    public void steeringFunction () {
        System.out.println("Functioning of steering coded here");	
    }
    
    public void breakFunction () {
        System.out.println("Functioning of break coded here");	
    }
    
    public void accelerateFunction () {
        System.out.println("Functioning of accelarate coded here");	
    }
    
    public abstract void fuelCosumptionFunction ();
	
}
