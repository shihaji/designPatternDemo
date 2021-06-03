package com.cts;

// Creational Pattern
// Singleton pattern

public class Employee {
	
	public static Employee emp=new Employee();
	
	private Employee() {
		
	}
	
	public static Employee getInstance() {
		return emp;
	}

}
