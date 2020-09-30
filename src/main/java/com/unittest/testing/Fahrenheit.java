package com.unittest.testing;

public class Fahrenheit {
	private double celsius;
	private double fahrenheit;
	
	public double getCelsius() {
		return this.celsius;
	}
	
	public double getFahrenheit() {
		return this.fahrenheit;
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
		calculate();
	}
	
	public void calculate() {
		this.fahrenheit = this.celsius*9/5+ 32;	
	}
	
	public String toString() {
		return Math.round(this.getCelsius() * 10.0) / 10.0+" celsius = "+Math.round(this.getFahrenheit() * 10.0) / 10.0+" fahrenheit";
	}
}
