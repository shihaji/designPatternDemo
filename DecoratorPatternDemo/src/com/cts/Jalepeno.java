package com.cts;

public class Jalepeno extends PizzaTopping{

	Jalepeno(PizzaBake pizzaBake) {
		super(pizzaBake);
		
	}
	
	public String addTopping() {
		 return super.addTopping()+" jalepeno added";
	}
	
	

}
