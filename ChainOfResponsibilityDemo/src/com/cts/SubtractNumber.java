package com.cts;

public class SubtractNumber implements Chain{

	Chain chain;
	
	@Override
	public void nextChain(Chain chain) {
		
		this.chain=chain;
		
	}

	@Override
	public void Calculate(Calculator cal) {
		
		if(cal.getOperator().equals("subtract")) {
			System.out.println(cal.getFirst()-cal.getSecond());
		}else {
			this.chain.Calculate(cal);
		}
		
		
	}
	
	

}
