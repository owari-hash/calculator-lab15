package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for Multiplication functionality.
 */
public class MultiplicationTest {

    private static final double DELTA = 0.0001;

    /**
     * Test multiplication of positive numbers.
     */
    @Test
    public void testMultiplyPositive() {
        Multiplication multiplication = new Multiplication();
        double result = multiplication.multiply(5.0, 3.0);
        assertEquals(15.0, result, DELTA);
    }

    /**
     * Test multiplication of negative numbers.
     */
    @Test
    public void testMultiplyNegative() {
        Multiplication multiplication = new Multiplication();
        double result = multiplication.multiply(-4.0, -5.0);
        assertEquals(20.0, result, DELTA);
    }

    /**
     * Test multiplication with zero.
     */
    @Test
    public void testMultiplyWithZero() {
        Multiplication multiplication = new Multiplication();
        double result = multiplication.multiply(7.0, 0.0);
        assertEquals(0.0, result, DELTA);
    }

    /**
     * Test multiplication of many numbers with valid array.
     */
    @Test
    public void testMultiplyManyValid() {
        Multiplication multiplication = new Multiplication();
        double[] numbers = { 2.0, 3.0, 4.0 };
        double result = multiplication.multiplyMany(numbers);
        assertEquals(24.0, result, DELTA);
    }

    /**
     * Test multiplication of many numbers with null array.
     */
    @Test
    public void testMultiplyManyWithNull() {
        Multiplication multiplication = new Multiplication();
        double result = multiplication.multiplyMany(null);
        assertEquals(0.0, result, DELTA);
    }

    /**
     * Test multiplication of many numbers with empty array.
     */
    @Test
    public void testMultiplyManyWithEmpty() {
        Multiplication multiplication = new Multiplication();
        double[] numbers = {};
        double result = multiplication.multiplyMany(numbers);
        assertEquals(0.0, result, DELTA);
    }
}