package com.cts;

public class Car implements GenericFactory {

	@Override
	public void createObject() {
	    System.out.println("car created");
		
	}

}
