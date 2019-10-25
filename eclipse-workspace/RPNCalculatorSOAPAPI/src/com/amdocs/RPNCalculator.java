package com.amdocs;

import java.util.Stack;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class RPNCalculator{

    private Stack<Double> numberStack;
    private double firstNumber,secondNumber,result;

    private boolean isMathOperator(String token) {
    	String mathOperators="+-/*";
    	return mathOperators.contains(token);	
    }
    public RPNCalculator(){

        numberStack = new Stack<Double>();
        firstNumber = secondNumber = result =0.0;
    }
    @WebMethod
    public double evaluate(String rpnMathExpression){
        String[] rpnTokens = rpnMathExpression.split(" ");
        IMathOperation mathOperation = null;

        for (String token:rpnTokens){ 
        	
        	if (isMathOperator(token)) {
        		mathOperation = MathFactory.getObject(token);
        		extractInputs();
        		result = mathOperation.evaluate(firstNumber,secondNumber);
        		numberStack.push(result);
        	}
        	else {
        	numberStack.push(Double.parseDouble(token));
        	}
        }
        return numberStack.pop();
    }

    private void  extractInputs(){
    	secondNumber = numberStack.pop();
        firstNumber = numberStack.pop();

    }
}