package com.cts;

public class Laptop implements GenericFactory{

	@Override
	public void createObject() {
		System.out.println("laptop created");
		
	}
	
	

}
