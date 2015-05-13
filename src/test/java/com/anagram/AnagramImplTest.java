package com.anagram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by binita on 18/04/15.
 */
public class AnagramImplTest {

    AnagramChecker checkAnagram = null;

    @Before
    public void setUp() throws Exception {
        checkAnagram = new AnagramCheckerImpl();
    }

    @Test
    public void testNullInputString() throws Exception {
        try{
            checkAnagram.testAnagram("nul",null);

        }
        catch (IllegalArgumentException e){
            assertEquals("Null or empty string not allowed",e.getMessage());
        }
    }

    @Test
    public void testNullSourceString() throws Exception {
        try{
            checkAnagram.testAnagram(null,"");
        }
        catch (IllegalArgumentException e){
            assertEquals("Null or empty string not allowed",e.getMessage());
        }

    }

    @Test
    public void testNullInputAndSourceString() throws Exception {
        try{
            checkAnagram.testAnagram(null,null);
        }
        catch (IllegalArgumentException e){
            assertEquals("Null or empty string not allowed",e.getMessage());
        }
    }

    @Test
    public void testEmptyInputAndSourceString() throws Exception {
        try{
            checkAnagram.testAnagram("","");
        }
        catch (IllegalArgumentException e){
            assertEquals("Null or empty string not allowed",e.getMessage());
        }
















    }

    @Test
    public void testForNegativeAnagram() throws Exception {
        assertFalse(checkAnagram.testAnagram("avd","sad"));

    }

    @Test
    public void testForSimplePositiveAnagram() throws Exception{
        assertTrue(checkAnagram.testAnagram("ab", "ba"));

    }

    @Test
    public void testForComplexPositiveAnagram() throws Exception {
        assertTrue(checkAnagram.testAnagram("lemon","melon"));

    }
}
