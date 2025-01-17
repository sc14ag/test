
package com.amdocs;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RPNCalculatorTest {

	
    private RPNCalculator rpnCalculator = null;

    @Before
    public void init() {
    	rpnCalculator = new RPNCalculatorService().getRPNCalculator();
    }
    
    @After
    public void cleanup() {
    	rpnCalculator = null;
    }
	
    @Test
    public void testAddition(){
        RPNCalculator rpnCalculator = new RPNCalculatorService().getRPNCalculator();
        double actualResult = rpnCalculator.evaluate("10 15 +");
        double expectedResult = 25.0;

        assertEquals(expectedResult,actualResult,0.0001);

        actualResult = rpnCalculator.evaluate("100 15 +");
        expectedResult = 115.0;
        assertEquals(expectedResult,actualResult,0.0001);
    }

    @Test
    public void testSubtraction(){
        double actualResult = rpnCalculator.evaluate("100 15 -");
        double expectedResult = 85.0;

        assertEquals(expectedResult,actualResult,0.0001);

        actualResult = rpnCalculator.evaluate("10 5 -");
        expectedResult = 5.0;
        assertEquals(expectedResult,actualResult,0.0001);

    }
    @Test
    public void testMultiplication(){
        double actualResult = rpnCalculator.evaluate("100 15 *");
        double expectedResult = 1500.0;

        assertEquals(expectedResult,actualResult,0.0001);

        actualResult = rpnCalculator.evaluate("10 5 *");
        expectedResult = 50.0;
        assertEquals(expectedResult,actualResult,0.0001);
    }
    @Test
    public void testDivision(){
        double actualResult = rpnCalculator.evaluate("100 10 /");
        double expectedResult = 10.0;

        assertEquals(expectedResult,actualResult,0.0001);

        actualResult = rpnCalculator.evaluate("10 5 /");
        expectedResult = 2.0;
        assertEquals(expectedResult,actualResult,0.0001);

    }
    @Test
     public void testComplexRPNCal() {
        double actualResult = rpnCalculator.evaluate("10 5 + 100 20 / -");
        double expectedResult = 10.0;

        assertEquals(expectedResult,actualResult,0.0001);

        actualResult = rpnCalculator.evaluate("15 7 1 1 + - / 3 * 2 1 1 + + -");
        expectedResult = 5.0;

        assertEquals(expectedResult,actualResult,0.0001);

    }

}