package com.designpattern.uniquechar;

import com.designpattern.uniquecharacter.UniqueCharacterString;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

/**
 * Created by binita on 25/02/15.
 * Implement an algorithm to determine if a string has all unique characters. What if you

 can not use additional data structures?
 */
public class TestUniqueCharacterString {
    UniqueCharacterString test = null;

    @Before
    public void setUp() throws Exception {
    test = new UniqueCharacterString();

    }

    @Test
    public void testStringwithOnlyOneCharacter() throws Exception {
     String sample = "v";
        assertEquals("unique character found",true,test.testUniqueCharacters(sample));
    }

    @Test
    public void testStringHavingSameCharacters() throws Exception {
      String sample= "ishanvi";
        assertFalse(test.testUniqueCharacters(sample));
    }

    @Test
    public void testStringContainingNull() throws Exception {
        assertFalse(test.testUniqueCharacters(null));

    }

    @Test
    public void testValidStringWithUniqueCharacters() throws Exception {
      String sample= "prabinshv";
              assertTrue(test.testUniqueCharacters(sample));
    }
}
