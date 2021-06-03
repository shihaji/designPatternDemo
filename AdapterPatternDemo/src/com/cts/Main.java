package com.cts;

public class Main {

	public static void main(String[] args) {
		
		Power p=new PowerAdapter(new Socket());
		
		System.out.println(p.getPower());

	}

}
