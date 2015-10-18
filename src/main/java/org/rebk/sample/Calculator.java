package org.rebk.sample;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        throw new UnsupportedOperationException();
    }

    public int divide(int a, int b) {
        throw new UnsupportedOperationException();
    }

}
