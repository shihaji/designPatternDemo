package com.cts;

public class FactoryProvider {
	
	public static AbstractFactory getFactory(String factoryName) {
		
		if(factoryName.equals("vehicle")) {
			return new VehicleFactory();
		}else {
			return new ComputerFactory();
		}
		
	}

}
