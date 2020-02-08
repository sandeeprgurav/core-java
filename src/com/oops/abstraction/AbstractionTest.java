package com.oops.abstraction;

public class AbstractionTest {

	public static void main(String[] args) {
		
		PetrolCar petrolCar = new PetrolCar();		
		petrolCar.wheelsFunction();
		petrolCar.steeringFunction();
		petrolCar.breakFunction();
		petrolCar.accelerateFunction();
		petrolCar.fuelCosumptionFunction();
		
		
		ElectricCar electricCar = new ElectricCar();
		electricCar.wheelsFunction();
		electricCar.steeringFunction();
		electricCar.breakFunction();
		electricCar.accelerateFunction();
		electricCar.fuelCosumptionFunction();
		
		
		DieselCar dieselCar = new DieselCar();
		dieselCar.wheelsFunction();
		dieselCar.steeringFunction();
		dieselCar.breakFunction();
		dieselCar.accelerateFunction();
		dieselCar.fuelCosumptionFunction();
		
		System.out.println("==================================================================================");
		
		Truck truck = new Truck();
		truck.wheelsFunction();
		truck.steeringFunction();
		truck.breakFunction();
		truck.accelerateFunction();
		truck.fuelCosumptionFunction();
		
		
		Auto auto = new Auto();
		auto.wheelsFunction();
		auto.steeringFunction();
		auto.breakFunction();
		auto.accelerateFunction();
		auto.fuelCosumptionFunction();		

	}

}
