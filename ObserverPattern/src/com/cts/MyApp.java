package com.cts;

import java.util.ArrayList;
import java.util.List;

public class MyApp {
	
	List<Observer> list=new ArrayList<Observer>();
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
	
		notifyObserver();
	}
	
	
	public void notifyObserver() {
		
		for(Observer o:list) {
			o.update();
		}
	}

}
