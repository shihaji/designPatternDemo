package com.cts;

public class ComputerFactory extends AbstractFactory{

	@Override
	public GenericFactory getFactory(String product) {
		
		if(product.equals("laptop")) {
			return new Laptop();
		}else {
			
			return new Desktop();
		}
		
		
	}
	
	

}
