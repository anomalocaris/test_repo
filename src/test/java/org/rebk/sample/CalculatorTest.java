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
}
