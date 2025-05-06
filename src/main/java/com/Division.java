package com;

/**
 * This class provides division operations.
 */
public class Division {

    /**
     * Divides two double values.
     *
     * @param a dividend
     * @param b divisor
     * @return the quotient of a divided by b
     * @throws ArithmeticException if divisor is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Safe division that returns a default value when dividing by zero.
     *
     * @param a            dividend
     * @param b            divisor
     * @param defaultValue value to return if divisor is zero
     * @return the quotient of a divided by b, or defaultValue if b is zero
     */
    public double safeDivide(double a, double b, double defaultValue) {
        if (b == 0) {
            return defaultValue;
        }
        return a / b;
    }
}