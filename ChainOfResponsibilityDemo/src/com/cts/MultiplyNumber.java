package com.cts;

public class MultiplyNumber implements Chain {

Chain chain;
	
	@Override
	public void nextChain(Chain chain) {
		
		this.chain=chain;
		
	}

	@Override
	public void Calculate(Calculator cal) {
		
		if(cal.getOperator().equals("multiply")) {
			System.out.println(cal.getFirst()*cal.getSecond());
		}else {
			System.out.println("invalid selection");
		}
		
		
	}
	
	
	
}
