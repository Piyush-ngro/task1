package com.example.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

public class MyTest {

    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void addTest() {
        double result = calculatorService.add(5, 3);
        assertEquals(8.0, result, 0.001);
    }

    @Test
    public void subtractTest() {
        double result = calculatorService.subtract(10, 4);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void multiplyTest() {
        double result = calculatorService.multiply(6, 2);
        assertEquals(12.0, result, 0.001);
    }

    @Test
    public void divideTest() {
        double result = calculatorService.divide(9, 3);
        assertEquals(3.0, result, 0.001);
    }

    @Test
    public void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(5, 0));
    }
}
