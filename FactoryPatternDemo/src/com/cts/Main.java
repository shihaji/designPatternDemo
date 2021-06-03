package com.cts;

public class Main {

	public static void main(String[] args) {
		
		
		Vehicle veh=VehicleFactory.getVehicle("bike");
		
		if(veh!=null) {
		
		veh.move();
		
		}else {
			System.out.println("wrong choice");
		}

	}

}
