package com;

/**
 * This class provides multiplication operations.
 */
public class Multiplication {

    /**
     * Multiplies two double values.
     *
     * @param a first operand
     * @param b second operand
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Multiplies multiple numbers.
     *
     * @param numbers array of numbers to multiply
     * @return the product of all numbers or 0 if array is empty
     */
    public double multiplyMany(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        double result = 1.0;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }
}