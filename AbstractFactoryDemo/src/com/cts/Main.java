package com.cts;

public class Main {

	public static void main(String[] args) {
		
		
		AbstractFactory af=FactoryProvider.getFactory("Computer");
		
		GenericFactory gf=af.getFactory("laptop");
		
		
		gf.createObject();
		

	}

}
