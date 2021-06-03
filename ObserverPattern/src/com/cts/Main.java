package com.cts;

public class Main {

	public static void main(String[] args) {
		
		MyApp myApp=new MyApp();
		
		myApp.list.add(new ObserverOne());

		myApp.list.add(new ObserverTwo());
		myApp.list.add(new ObserverThree());
		
		myApp.setState(0);
		
	}

}
