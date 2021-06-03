package com.cts;

public class AddNumber implements Chain{

	Chain chain;
	
	@Override
	public void nextChain(Chain chain) {
		this.chain=chain;
		
	}

	@Override
	public void Calculate(Calculator cal) {
		
		if(cal.getOperator().equals("add")) {
			System.out.println(cal.getFirst()+cal.getSecond());
		}else {
		    chain.Calculate(cal);
			
		}
		
	}
	
	

}
