package com.amdocs;

import org.tempuri.*;

public class Main{
	public static void main(String[] args){
		
		System.setProperty("java.net.useSystemProxies","true");
		Calculator calculator = new Calculator();
		CalculatorSoap soapObject = calculator.getCalculatorSoap();

		int result = soapObject.add(100,200);

		System.out.println("The result is " + result);
	}
}





