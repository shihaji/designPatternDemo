package com.cts;

// Creational Design Pattern
// Factory patern

public class VehicleFactory {

	
	public static Vehicle getVehicle(String vehicleType) {
		
		if(vehicleType.equals("car")) {
			return new Car();
		}else if(vehicleType.equals("bike")){
			
			return new Bike();
		}else {
			return null;
		}
		
		
	}
	
}
