package com.fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 05/03/15.
 */
public class FibonacciImplTest {
    Fibonacci fibonacci = null;

    @Before
    public void setUp() throws Exception {
        fibonacci = new FibonacciImpl();

    }

    @Test
    public void testForZeroInput() throws Exception {
        assertEquals("Should be zero",0,fibonacci.fibonacci(0));

    }

    @Test
    public void testForOneInput() throws Exception {
        assertEquals("Should be one", 1, fibonacci.fibonacci(1));

    }

    @Test
    public void testForNegativeNoInput() throws Exception {
        try{
            fibonacci.fibonacci(-1);
            fail("Should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Negative no not allowed",e.getMessage());
        }
    }

    @Test
    public void testForPositiveValidInput() throws Exception {
        assertEquals("Should be 7",7,fibonacci.fibonacci(5));

    }

    @Test
    public void testLargePositiveNo() throws Exception {
        assertEquals("Should be 199", 199, fibonacci.fibonacci(101));

    }
}
