package com.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 04/03/15.
 * Create a class (FizzBuzz) with the following interface:
 String answer(int number);
 The answers should be as follows:
 If the number is divisible by three, the answer should be “fizz”
 If the number is divisible by five, the answer should be “buzz”
 If the number is divisible by both, the answer should be “fizzbuzz”
 Otherwise the answer should be the the number as a string.

 */
public class FizzBuzzImplTest {

    FizzBuzz fizzbuzzImpl = null;
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZBUZZ = "fizzbuzz";

    @Before
    public void setUp() throws Exception {
        fizzbuzzImpl = new FizzBuzzImpl();

    }

    @Test
    public void testZeroInput() throws Exception {
        assertEquals("Should return 0 as string", "0", fizzbuzzImpl.answer(0));

    }

    @Test
    public void testNegativeNumber() throws Exception {
        assertEquals("Should return number as string","-1", fizzbuzzImpl.answer(-1));

    }

    @Test
    public void testSimpleInputDivisibleBy3() throws Exception {
        assertEquals("Should return fizz as string",FIZZ, fizzbuzzImpl.answer(6));
    }
    @Test
    public void testVeryLargeNoDivisibleBy3() throws Exception{
        assertEquals("Should return fizz as string", FIZZ, fizzbuzzImpl.answer(909));
    }

    @Test
    public void testSimpleInputDivisibleBy5() throws Exception {
        assertEquals("Should return buzz as string", BUZZ, fizzbuzzImpl.answer(25));

    }

    @Test
    public void testVeryLargeInputDivisibleBy5() throws Exception {
        assertEquals("Should return buzz as string", BUZZ, fizzbuzzImpl.answer(189680));

    }

    @Test
    public void testSimpleInputDivisibleBy5And3() throws Exception {
        assertEquals("Should return fizzbuzz as string", FIZZBUZZ, fizzbuzzImpl.answer(90));
    }

    @Test
    public void testVeryLargeNoDivisibleBy5And3() throws Exception {
        assertEquals("Should return fizz as string", FIZZBUZZ, fizzbuzzImpl.answer(1800000));

    }

    @Test
    public void testSimpleNoNottDivisibleBy5And3() throws Exception {
        assertEquals("Should return 919 as string", "919", fizzbuzzImpl.answer(919));
    }

    @Test
    public void testVeryLargeNoNotDivisibleBy5And3() throws Exception {
        assertEquals("Should return number as string", "19032424", fizzbuzzImpl.answer(19032424));
    }

    @Test
    public void testVeryLargeNegativeDivisibleBy3() throws Exception {
        assertEquals("Should return fizzbuzz as string", FIZZ, fizzbuzzImpl.answer(-909018));
    }

    @Test
    public void testNegativeNoDivisibleBy5() throws Exception {
        assertEquals("Should return buzz as string", BUZZ, fizzbuzzImpl.answer(-2500));
    }
}
