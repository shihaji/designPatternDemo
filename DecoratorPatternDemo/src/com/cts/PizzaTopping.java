package com.cts;

public abstract class PizzaTopping implements PizzaBake {
	
	PizzaBake pizzaBake;
	
	PizzaTopping(PizzaBake pizzaBake){
		this.pizzaBake=pizzaBake;
		
	}
	
	@Override
	public String addTopping() {
		
		return pizzaBake.addTopping();
	}

}
