package com.cts;

public class Calculator {
	
	private int first;
	private int second;
	
	private String operator;

	public Calculator(int first, int second, String operator) {
		super();
		this.first = first;
		this.second = second;
		this.operator = operator;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	public String getOperator() {
		return operator;
	}
	
	

}
