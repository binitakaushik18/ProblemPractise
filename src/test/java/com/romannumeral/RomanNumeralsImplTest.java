package com.romannumeral;

import com.romannumerals.RomanNumerals;
import com.romannumerals.RomanNumeralsImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 05/03/15.
 */
public class RomanNumeralsImplTest {
    RomanNumerals romanNumerals = null;

    @Before
    public void setUp() throws Exception {
        romanNumerals = new RomanNumeralsImpl();

    }

    @Test
    public void testForNegativeNumer() throws Exception {
     try{
         romanNumerals.convert(-4);
         fail("Should not reach here");
     }
     catch(IllegalArgumentException e){
         //expected
         assertEquals("Roman numeral does not exist for zero or negative number",e.getMessage());
     }
    }

    @Test
    public void testForZero() throws Exception {
        try{
            romanNumerals.convert(0);
            fail("Should not reach here");
        }
        catch(IllegalArgumentException e){
            //expected
            assertEquals("Roman numeral does not exist for zero or negative number",e.getMessage());
        }

    }

    @Test
    public void testForNumberOne() throws Exception {
        assertEquals("Should return I","I",romanNumerals.convert(1));

    }

    @Test
    public void testForNumberTwo() throws Exception {
        assertEquals("Should return II", "II", romanNumerals.convert(2));

    }

    @Test
    public void testForNumberFour() throws Exception {
        assertEquals("Should return IV", "IV", romanNumerals.convert(4));
    }
    @Test
    public void testForNumberFive() throws Exception {
        assertEquals("Should return V", "V", romanNumerals.convert(5));
    }

    @Test
    public void testForNumberEight() throws Exception {
        assertEquals("Should return VIII", "VIII", romanNumerals.convert(8));
    }

    @Test
    public void testForNumberNine() throws Exception {
        assertEquals("Should return IX", "IX", romanNumerals.convert(9));
    }

    @Test
    public void testForNumberTen() throws Exception {
        assertEquals("Should return X", "X", romanNumerals.convert(10));
    }

    @Test
    public void testForNumberFifteen() throws Exception {
        assertEquals("Should return XV", "XV", romanNumerals.convert(15));
    }

    @Test
    public void testForNumberNineteen() throws Exception {
        assertEquals("Should return XIX", "XIX", romanNumerals.convert(19));
    }
}
