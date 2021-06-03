package com.cts;

public class Main {

	public static void main(String[] args) {
		
		PizzaTopping pt=new Jalepeno(new Pizza());
		
		System.out.println(pt.addTopping());

	}

}
