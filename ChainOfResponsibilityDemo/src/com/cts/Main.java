package com.cts;

public class Main {

	public static void main(String[] args) {
	
		Chain a=new AddNumber();
		Chain b=new SubtractNumber();
		Chain c=new MultiplyNumber();
		
		a.nextChain(b);
		b.nextChain(c);
		
		Calculator cal=new Calculator(20, 10, "sdff");
		
		a.Calculate(cal);
		

	}

}
