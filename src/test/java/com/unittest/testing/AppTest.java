package com.unittest.testing;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	Fahrenheit object;
	
	@Before
	public void newClassFahrenheit() {
		object = new Fahrenheit();
	}
	
	@Test
	  public void testResultTrueInput0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInput1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInput499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInput500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInput501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInput999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInput1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultFalseInput1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultFalseInput1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultFalseInput2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInputMinus1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInputMinus499() {
		double input = -499;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInputMinus500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInputMinus501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInputMinus999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultTrueInputMinus1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultFalseInputMinus1001() {
		double input = -1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultFalseInputMinus1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultFalseInputMinus2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
	    assertEquals(expected,actual);
	  }
	
	@Test
	  public void testResult32CalculateFromInput0() {
		double input = 0;
		double expected = 32;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResult33point8CalculateFromInput1() {
		double input = 1;
		double expected = 33.8;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResult930point2CalculateFromInput499() {
		double input = 499;
		double expected = 930.2;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResult932CalculateFromInput500() {
		double input = 500;
		double expected = 932;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResult932point8CalculateFromInput501() {
		double input = 501;
		double expected = 933.8;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResult1830point2CalculateFromInput999() {
		double input = 999;
		double expected = 1830.2;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResult1832CalculateFromInput1000() {
		double input = 1000;
		double expected = 1832;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResult30point2CalculateFromInputMinus1() {
		double input = -1;
		double expected = 30.2;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResultMinus866point2CalculateFromInputMinus499() {
		double input = -499;
		double expected = -866.2;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResultMinusMinus868CalculateFromInputMinus500() {
		double input = -500;
		double expected = -868;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResultMinus869point8CalculateFromInputMinus501() {
		double input = -501;
		double expected = -869.8;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResultMinus1766point2CalculateFromInputMinus999() {
		double input = -999;
		double expected = -1766.2;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	@Test
	  public void testResultMinus1768CalculateFromInputMinus1000() {
		double input = -1000;
		double expected = -1768;
		object.input(input);
		double actual = object.getFahrenheit();
	    assertEquals(expected,actual,2);
	  }
	
	
	@Test
	  public void testResultMessageOutputFromInput0() {
		double input = 0;
		String expected = "0.0 celsius = 32.0 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInput1() {
		double input = 1;
		String expected = "1.0 celsius = 33.8 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInput499() {
		double input = 499;
		String expected = "499.0 celsius = 930.2 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInput500() {
		double input = 500;
		String expected = "500.0 celsius = 932.0 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInput501() {
		double input = 501;
		String expected = "501.0 celsius = 933.8 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInput999() {
		double input = 999;
		String expected = "999.0 celsius = 1830.2 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInput1000() {
		double input = 1000;
		String expected = "1000.0 celsius = 1832.0 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInputMinus1() {
		double input = -1;
		String expected = "-1.0 celsius = 30.2 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInputMinus499() {
		double input = -499;
		String expected = "-499.0 celsius = -866.2 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInputMinus500() {
		double input = -500;
		String expected = "-500.0 celsius = -868.0 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInputMinus501() {
		double input = -501;
		String expected = "-501.0 celsius = -869.8 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInputMinus999() {
		double input = -999;
		String expected = "-999.0 celsius = -1766.2 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
	@Test
	  public void testResultMessageOutputFromInputMinus1000() {
		double input = -1000;
		String expected = "-1000.0 celsius = -1768.0 fahrenheit";
		object.input(input);
		String actual = object.toString();
	    assertEquals(expected,actual);
	  }
}


