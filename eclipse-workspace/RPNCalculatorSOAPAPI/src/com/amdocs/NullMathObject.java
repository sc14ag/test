package com.amdocs;

public class NullMathObject implements IMathOperation {

	public double evaluate(double firstNumber, double secondNumber) {
		System.out.println("Unsupported math operation ...");
		return 0;
	}

}
