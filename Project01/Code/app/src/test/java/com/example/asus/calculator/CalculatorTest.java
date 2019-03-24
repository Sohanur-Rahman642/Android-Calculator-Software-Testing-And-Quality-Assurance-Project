package com.example.asus.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

public class CalculatorTest {


    private static final double DELTA = 0.001;

    /*--DELTA is actually the measure of error here,
      or in a word it defines uncertainty. In this case,
      delta is the maximum allowed absolute difference
      between actual and expected value. So the test is
      basically-
      if (Math.absolute(expected - actual) > delta)
      fail
    --*/


    @Test

    /*
    * Take two double parameters
    * Call Addition method of the Calculator class
    * Call assertEquals method to compare between expected & actual value
    * */

    public void testAddition() throws Exception {

        double number1 = 2.4;
        double number2 = 1.7;
        double expected = 4.1;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);

    }
    
    public void testAddition() throws Exception {

        double number1 = 2.0;
        double number2 = 1.0;
        double expected = 3.0;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);
    }
    
    public void testAddition() throws Exception {

        double number1 = 112.0;
        double number2 = 12.0;
        double expected = 124.0;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);
    }
    
    public void testAddition() throws Exception {

        double number1 = 3000.0;
        double number2 = 4005.0;
        double expected = 7005.0;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);
    }
    
    public void testAddition() throws Exception {

        double number1 = 100000.0;
        double number2 = 100000.0;
        double expected = 200000.0;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);
    }

    public void testAddition() throws Exception {

        double number1 = 500000.0;
        double number2 = 5000000.0;
        double expected = 5500000.0;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);
    }

    public void testAddition() throws Exception {

        double number1 = 1001.0;
        double number2 = 2004.5;
        double expected = 3005.5;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);
    }
    
    public void testAddition() throws Exception {

        double number1 = 10202.0;
        double number2 = 20201.0;
        double expected = 30403.0;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);
    }
    
    public void testAddition() throws Exception {

        double number1 = 2.0;
        double number2 = 1.0;
        double expected = 3.0;

        double actual = Calculator.Addition(number1,number2);
        assertEquals(expected,actual,DELTA);
    }
    @Test
    /*
     * Take two double parameters
     * Call Subtraction method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testSubtraction() throws Exception {

            double number1 = 2.4;
            double number2 = 1.7;
            double expected = 0.7;

            double actual = Calculator.Subtraction(number1,number2);
            assertEquals(expected,actual,DELTA);

    }
    
    public void testSubtraction() throws Exception {

        double number1 = 7.8;
        double number2 = 5.3;
        double expected = 2.5;

        double actual = Calculator.Subtraction(number1,number2);
        assertEquals(expected,actual,DELTA);

}
    
    public void testSubtraction() throws Exception {

        double number1 = 100078.8;
        double number2 = 3.5;
        double expected = 100075.3;

        double actual = Calculator.Subtraction(number1,number2);
        assertEquals(expected,actual,DELTA);

}

    public void testSubtraction() throws Exception {

        double number1 = 5078.8;
        double number2 = 4567.5;
        double expected = 511.3;

        double actual = Calculator.Subtraction(number1,number2);
        assertEquals(expected,actual,DELTA);

}
    

    @Test
    /*
     * Objective: Check the method for negative outputs
     * Take two double parameters
     * Call Subtraction method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testSubtractionForNegativeOutputs() throws Exception {

        double number1 = 1.3 ;
        double number2 = 4.2;
        double expected = -2.9;

        double actual = Calculator.Subtraction(number1,number2);
        assertEquals(expected,actual,DELTA);

    }

    @Test
    /*
     * Take two double parameters
     * Call Multiplication method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testMultiplication() throws Exception {

        double number1 = 3.7 ;
        double number2 = 8.2;
        double expected = 30.34;

        double actual = Calculator.Multiplication(number1,number2);
        assertEquals(expected,actual,DELTA);

    }


    @Test
    /*
     * Take two double parameters
     * Call Division method of the Calculator class
     * Call assertEquals method to compare between expected & actual value
     * */

    public void testDivision() throws Exception {

        double number1 = .5;
        double number2 = 2;
        double expected = 2.5;

        double actual = Calculator.Division(number1,number2);
        assertEquals(expected,actual,DELTA);

    }

    /*--Test for checking output of division by zero operations--*/

    /*
     * Objective: Showing test failed with getting the java.lang.ArithmeticException
     * Take two double parameters with one zero
     * Call Division method of the Calculator class
     * */

    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivisionByZero() throws ArithmeticException
    {
        double number1 = 7;
        double number2 = 0;

        Calculator.Division(number1, number2);

    }







}