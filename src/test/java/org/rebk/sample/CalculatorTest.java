package org.rebk.sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        // setup
        Calculator c = new Calculator();

        // execute
        int actual = c.add(3, 4);

        // verify
        assertThat(actual, is(7));
    }

    @Test
    public void testSubtract() throws Exception {
        // setup
        Calculator c = new Calculator();

        // execute
        int actual = c.subtract(3, 4);

        // verify
        assertThat(actual, is(-1));
    }

    @Test
    public void testMultiply() throws Exception {
        // setup
        Calculator c = new Calculator();

        // execute
        int actual = c.multiply(3, 4);

        // verify
        assertThat(actual, is(12));
    }

    @Test
    public void testDivide() throws Exception {
        // setup
        Calculator c = new Calculator();

        // execute
        int actual = c.divide(10, 2);

        // verify
        assertThat(actual, is(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionWhenDivisorIsZero() throws  Exception {
        // setup
        Calculator c = new Calculator();

        // execute
        int actual = c.divide(10, 0);
    }
}
