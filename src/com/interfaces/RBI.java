package com.interfaces;

public interface RBI {
    void rateOfintrest();
}
class HDFC implements RBI {

	@Override
	public void rateOfintrest() {
		System.out.println("HDFC bank rate of interest is 10%");
		
	}
	
}

class SBI implements RBI{

	@Override
	public void rateOfintrest() {
		System.out.println("SBI bank rate of interest is 20%");
		
	}
	
}
class ICIC implements RBI{

	@Override
	public void rateOfintrest() {
		
		System.out.println("SBI bank rate of interest is 25%");
	}
	
}
