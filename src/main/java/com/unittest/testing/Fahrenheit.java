package com.unittest.testing;

public class Fahrenheit {
	private double celsius;
	
	public double getCelsius() {
		// TODO Auto-generated method stub
		return celsius;
	}
	public boolean isBound(double celsius) {
		boolean isResult;
		if(celsius >= -1000 && celsius <= 1000) 
			isResult = true;
		else
			isResult = false;
		return isResult;
	}
	public void input(double celsius) {	
		this.celsius = celsius;
	}
}
