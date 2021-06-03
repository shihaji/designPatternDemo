package com.cts;

public class PowerAdapter implements Power {
	
	Socket socket;
	
	PowerAdapter(Socket socket){
		this.socket=socket;
	}

	@Override
	public int getPower() {
		
		return socket.getPower()/80;
	}

}
