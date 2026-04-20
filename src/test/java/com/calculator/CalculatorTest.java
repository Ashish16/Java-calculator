package com.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testSumWithPositiveIntegers() {
        int result = calculator.sum(5, 10);
        assertEquals(15, result, "5 + 10 should equal 15");
    }
    
    @Test
    public void testSumWithNegativeIntegers() {
        int result = calculator.sum(-5, -10);
        assertEquals(-15, result, "-5 + -10 should equal -15");
    }
    
    @Test
    public void testSumWithMixedIntegers() {
        int result = calculator.sum(-5, 10);
        assertEquals(5, result, "-5 + 10 should equal 5");
    }
    
    @Test
    public void testSumWithZero() {
        int result = calculator.sum(0, 10);
        assertEquals(10, result, "0 + 10 should equal 10");
    }
    
    @Test
    public void testSumWithPositiveDoubles() {
        double result = calculator.sum(5.5, 10.5);
        assertEquals(16.0, result, 0.001, "5.5 + 10.5 should equal 16.0");
    }
    
    @Test
    public void testSumWithNegativeDoubles() {
        double result = calculator.sum(-5.5, -10.5);
        assertEquals(-16.0, result, 0.001, "-5.5 + -10.5 should equal -16.0");
    }
    
    @Test
    public void testSumWithMixedDoubles() {
        double result = calculator.sum(-5.5, 10.5);
        assertEquals(5.0, result, 0.001, "-5.5 + 10.5 should equal 5.0");
    }
    
    @Test
    public void testSumWithLargeNumbers() {
        int result = calculator.sum(1000000, 2000000);
        assertEquals(3000000, result, "1000000 + 2000000 should equal 3000000");
    }
}

// Made with Bob
