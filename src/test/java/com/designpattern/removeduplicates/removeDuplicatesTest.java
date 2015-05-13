package com.designpattern.removeduplicates;

import com.designpattern.removeDuplicates.RemoveDuplicates;
import com.designpattern.removeDuplicates.RemoveDuplicatesImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Design an algorithm and write code to remove the duplicate characters in a string

 without using any additional buffer. NOTE: One or two additional variables are fine.

 An extra copy of the array is not.

 FOLLOW UP

 Write the test cases for this method.
 * Created by binita on 26/02/15.
 *
 */
public class removeDuplicatesTest {

    RemoveDuplicates removeDuplicates = null;

    @Before
    public void setUp() throws Exception {
        removeDuplicates = new RemoveDuplicatesImpl();

    }

    @Test(expected = EmptyStackException.class)
    public void testForEmptyList() throws Exception {
      removeDuplicates.removeDuplicates("");

    }

    @Test
    public void testForOnlyOneElementInList() throws Exception {
        assertEquals("only one string return as is", removeDuplicates.removeDuplicates("a"), "a");

    }

    @Test
    public void testForDuplicatesAtStartAndEnd() throws Exception {
        assertEquals("duplicate at start and end", "bacfr", removeDuplicates.removeDuplicates("bacfrb"));

    }

    @Test
    public void testForDuplicatesInMiddle() throws Exception {
        assertEquals("duplicate at start and end", "bafcr", removeDuplicates.removeDuplicates("bafcfr"));

    }
    @Test
    public void testForNoDuplicates() throws Exception {
        assertEquals("duplicate at start and end", "prabin", removeDuplicates.removeDuplicates("prabin"));

    }

    @Test
    public void testForOnlyDuplicates() throws Exception {
        assertEquals("duplicate at start and end", "i", removeDuplicates.removeDuplicates("iiii"));

    }



}
