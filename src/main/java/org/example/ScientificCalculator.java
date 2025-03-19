// Chnages made after ngrok

package org.example;

public class ScientificCalculator {

    public static double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not defined.");
        }
        return Math.sqrt(number);
    }


    public long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public double naturalLog(double x) {
        if (x <= 0) throw new IllegalArgumentException("Natural logarithm is not defined for non-positive numbers.");
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
