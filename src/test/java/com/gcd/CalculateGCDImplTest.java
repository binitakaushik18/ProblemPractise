package com.gcd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 06/03/15.
 */
public class CalculateGCDImplTest {

    CalculateGCD calculateGCD = null;

    @Before
    public void setUp() throws Exception {

        calculateGCD = new CalculateGCDImpl();

    }

    @Test
    public void testGetGCDForFirstParamZero() throws Exception {
        try {
            calculateGCD.calcGCD(0, 5);
            fail("Should not reach here");

        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Should return exception","Cannot calculate GCD for zero or negative numbers",e.getMessage());
        }
    }

    @Test
    public void testGetGCDForSecondParamZero() throws Exception {
        try {
            calculateGCD.calcGCD(3, 0);
            fail("Should not reach here");

        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Should return exception","Cannot calculate GCD for zero or negative numbers",e.getMessage());
        }

    }

    @Test
    public void testGetGCDForBothParamZero() throws Exception {
        try {
            calculateGCD.calcGCD(0, 0);
            fail("Should not reach here");

        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Should return exception","Cannot calculate GCD for zero or negative numbers",e.getMessage());
        }

    }

    @Test
    public void testGetGCDForNegativeNo() throws Exception {
        try {
            calculateGCD.calcGCD(1, -5);
            fail("Should not reach here");

        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Should return exception","Cannot calculate GCD for zero or negative numbers",e.getMessage());
        }

    }

    @Test
    public void testGetGCDForPrimeNos() throws Exception {
        assertEquals("Should return GCD as 1 for prime no's",1,calculateGCD.calcGCD(11,29));
    }

    @Test
    public void testGetGCDForSmallNos() throws Exception {
        assertEquals("Should return GCD as 4 for 4 and 8", 4, calculateGCD.calcGCD(4,8));

    }

    @Test
    public void testGetGCDForBothNegativeNo() throws Exception {
        try {
            calculateGCD.calcGCD(-1, -5);
            fail("Should not reach here");

        }
        catch (IllegalArgumentException e)
        {
            assertEquals("Should return exception","Cannot calculate GCD for zero or negative numbers",e.getMessage());
        }

    }

    @Test
    public void testGetGCDForLargeNos() throws Exception {
        assertEquals("Should return gcd 8 for number 16,48",16,calculateGCD.calcGCD(16,48));

    }

    @Test
    public void testGetGCDForLargeNo() throws Exception {
        assertEquals("Should return gcd 10 for number 80,90",10,calculateGCD.calcGCD(80,90));

    }
}
