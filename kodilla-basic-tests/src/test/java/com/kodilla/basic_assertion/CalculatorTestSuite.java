package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        double a = 5.3;
        double b = 6.7;
        double subResult = calculator.subtract(a, b);
        assertEquals(-1.4,subResult, 0.1);
    }
    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = -2;
        int squareResult = calculator.square(a);
        assertEquals(4, squareResult,2);
    }
}
