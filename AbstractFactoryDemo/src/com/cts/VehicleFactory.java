package com.cts;

public class VehicleFactory extends AbstractFactory {

	@Override
	public GenericFactory getFactory(String product) {

		if (product.equals("car")) {
			return new Car();
		} else {
			return new Bike();
		}

	}

}
