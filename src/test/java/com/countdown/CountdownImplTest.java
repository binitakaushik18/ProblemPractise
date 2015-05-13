package com.countdown;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by binita on 05/03/15.
 */
public class CountdownImplTest {
    Countdown countdown = null;

    @Before
    public void setUp() throws Exception {
        countdown = new CountdownImpl();
    }

    @Test
    public void testForZeroInput() throws Exception {
        try {
            int[] result = new int[1];
            result[0] = 0;
            assertTrue("should return zero", Arrays.equals(result, countdown.countdown(0)));
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void testForNegativeNoInput() throws Exception {
        try{
            countdown.countdown(-4);
            fail("Should not reach here");
        }
        catch(IllegalArgumentException e) {
            assertEquals("should return exception for negative no","Negative no not allowed",e.getMessage());
        }
    }

    @Test
    public void testForValidSimpleInput() throws Exception {
        int[] expectedResult = new int[]{4,3,2,1,0};
        assertTrue("Should return true", Arrays.equals(expectedResult, countdown.countdown(4)));
    }

    @Test
    public void testForLargePositiveInput() throws Exception {
        int[] expectedResult = new int[]{9,8,7,6,5,4,3,2,1,0};
        assertTrue("Should return true", Arrays.equals(expectedResult,countdown.countdown(9)));

    }

    @Test
    public void testForVerylargeNegativeInput() throws Exception {
        try{
            countdown.countdown(-99);
            fail("Should not reach here");
        }
        catch(IllegalArgumentException e) {
            assertEquals("should return exception for negative no","Negative no not allowed",e.getMessage());
        }
    }

}
