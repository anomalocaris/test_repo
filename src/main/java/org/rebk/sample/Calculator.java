package org.rebk.sample;

/**
 * Execute Calculation
 */
public class Calculator {

    /**
     * Execute Add
     * @param a summand
     * @param b addend
     * @return Calculation result.
     * */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Execute subtract
     * @param a minuend
     * @param b subtrahend
     * @return Calculation result.
     * */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Execute multiply
     * @param a multiplicand
     * @param b multiplier
     * @return Calculation result.
     * */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Execute divide
     * @param a dividend
     * @param b divisor
     * @return Calculation result. The floor is computed and the remainder is thrown away.
     * */
    public int divide(int a, int b){
        int result;
        try{
            result = a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
        return result;
    }
}
