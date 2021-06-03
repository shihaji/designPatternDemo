package com.cts;

public class Desktop implements GenericFactory{

	@Override
	public void createObject() {
		System.out.println("desktop created");
		
	}

}
