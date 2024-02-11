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
        // Test factorial of 5
        int expectedResult = 120;
        int actualResult = calculator.factorial(5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLogarithmic() {
        // Test logarithm of 10
        double expectedResult = 2.302585092994046;
        double actualResult = calculator.logarithmic(10);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    public void testSquareRoot() {
        // Test square root of 16
        double expectedResult = 4.0;
        double actualResult = calculator.squareRoot(16);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPower() {
        // Test power of 2 to the exponent of 3
        double expectedResult = 8.0;
        double actualResult = calculator.power(2, 3);
        assertEquals(expectedResult, actualResult);
    }
}
