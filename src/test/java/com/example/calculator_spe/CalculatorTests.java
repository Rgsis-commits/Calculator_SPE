package com.example.calculator_spe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTests {

    @InjectMocks
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFactorial() {
        // Test factorial of 4
        int expectedResult = 24;
        int actualResult = calculator.factorial(4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogarithmic() {
        // Test logarithm of 5
        double expectedResult = 1.60943791243;
        double actualResult = calculator.logarithmic(5);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    public void testSquareRoot() {
        // Test square root of 49
        double expectedResult = 7.0;
        double actualResult = calculator.squareRoot(49);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPower() {
        // Test power of 4 to the exponent of 3
        double expectedResult = 64.0;
        double actualResult = calculator.power(4, 3);
        assertEquals(expectedResult, actualResult);
    }
}
