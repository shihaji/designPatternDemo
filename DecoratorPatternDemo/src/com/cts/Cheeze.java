package com.cts;

public class Cheeze  extends PizzaTopping{

	Cheeze(PizzaBake pizzaBake) {
		super(pizzaBake);
		
	}
	
	public String addTopping() {
		 return super.addTopping()+" cheeze added";
	}
	

}
