package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class for Division functionality.
 */
public class DivisionTest {

    private static final double DELTA = 0.0001;

    /**
     * Test division of positive numbers.
     */
    @Test
    public void testDividePositive() {
        Division division = new Division();
        double result = division.divide(10.0, 2.0);
        assertEquals(5.0, result, DELTA);
    }

    /**
     * Test division of negative numbers.
     */
    @Test
    public void testDivideNegative() {
        Division division = new Division();
        double result = division.divide(-20.0, -5.0);
        assertEquals(4.0, result, DELTA);
    }

    /**
     * Test division by zero throws exception.
     */
    @Test
    public void testDivideByZero() {
        Division division = new Division();
        assertThrows(ArithmeticException.class, () -> division.divide(15.0, 0.0));
    }

    /**
     * Test safe division with non-zero divisor.
     */
    @Test
    public void testSafeDivideNormal() {
        Division division = new Division();
        double result = division.safeDivide(12.0, 4.0, 999.0);
        assertEquals(3.0, result, DELTA);
    }

    /**
     * Test safe division with zero divisor returns default value.
     */
    @Test
    public void testSafeDivideByZero() {
        Division division = new Division();
        double result = division.safeDivide(8.0, 0.0, 999.0);
        assertEquals(999.0, result, DELTA);
    }
}