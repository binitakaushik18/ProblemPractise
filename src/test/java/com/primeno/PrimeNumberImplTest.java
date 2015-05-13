package com.primeno;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by binita on 11/03/15.
 */
public class PrimeNumberImplTest {
    PrimeNumber primeNumberImpl = null;
    @Before
    public void setUp() throws Exception {
        primeNumberImpl = new PrimeNumberImpl();

    }

    @Test
    public void testPrimeNumberForZeroInput() throws Exception {
        assertFalse("Zero is not prime number", primeNumberImpl.isPrime(0));
    }

    @Test
    public void testPrimeNumberForOneInput() throws Exception {
        assertFalse("one is not a prime number", primeNumberImpl.isPrime(1));
    }

    @Test
    public void testPrimeNumberForNegativeNumberInput() throws Exception {
        assertFalse("Negative number not prime number", primeNumberImpl.isPrime(-9));

    }

    @Test
    public void testPrimeNumberForEvenNumber() throws Exception {
        assertFalse("Even number not a prime number",primeNumberImpl.isPrime(4));
    }

    @Test
    public void testPrimeNumberForTwoNumber() throws Exception {
        assertTrue("2 is a prime number", primeNumberImpl.isPrime(2));
    }

    @Test
    public void testPrimeNumberForThreeNumber() throws Exception {
        assertTrue("3 is a prime number",primeNumberImpl.isPrime(3));
    }

    @Test
    public void testPrimeNumberForSmallPrimeNumber() throws Exception {
        assertTrue("5 is a prime number",primeNumberImpl.isPrime(5));
    }

    @Test
    public void testPrimeNumberForLargePrimeNumber() throws Exception {
        assertTrue("87 is a prime number should return true", primeNumberImpl.isPrime(97));
    }

    @Test
    public void testPrimeNoBetweenOneandTen() throws Exception {
        List<Integer> primeNoList = Lists.newArrayList(2,3,5,7);
        assertEquals("Should return expected list",primeNoList,primeNumberImpl.calculatePrime(0,10));

    }

    @Test
    public void testPrimeNoBetweenZeroandTwenty() throws Exception {
        List<Integer> primeNoList = Lists.newArrayList(2,3,5,7,11,13,17,19);
        assertEquals("Should return expected list",primeNoList,primeNumberImpl.calculatePrime(0,20));
    }

    @Test
    public void testPrimeNoBetweenZeroAndHundred() throws Exception {
        List<Integer> primeNoList = Lists.newArrayList(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97);
        assertEquals("Should return expected list",primeNoList,primeNumberImpl.calculatePrime(0,100));

    }
}
