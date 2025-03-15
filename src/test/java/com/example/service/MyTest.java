package com.example.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class MyTest {

    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void addTest() {
        assertEquals(8.0, calculatorService.add(5, 3), 0.001);
    }

    @Test
    public void subtractTest() {
        assertEquals(6.0, calculatorService.subtract(10, 4), 0.001);
    }

    @Test
    public void multiplyTest() {
        assertEquals(12.0, calculatorService.multiply(6, 2), 0.001);
    }

    @Test
    public void divideTest() {
        assertEquals(3.0, calculatorService.divide(9, 3), 0.001);
    }

    @Test
    public void divideByZeroTest() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(5, 0));
    }
}
