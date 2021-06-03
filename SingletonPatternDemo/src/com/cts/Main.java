package com.cts;

public class Main {

	public static void main(String[] args) {
		
		
		Employee emp=Employee.getInstance();
		
		Employee emp1=Employee.getInstance();
		
		System.out.println(emp==emp1);

	}

}
