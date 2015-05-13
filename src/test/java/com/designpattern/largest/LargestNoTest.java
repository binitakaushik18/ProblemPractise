package com.designpattern.largest;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 24/02/15.
 */
public class LargestNoTest {
    LargestNumber largestNo = null;


    @Before
    public void setUp() throws Exception {
      largestNo = new LargestNumberImpl();


    }

    @Test(expected = EmptyStackException.class)
    public void testNullArrayPassed() throws Exception {
     largestNo.largestNumber(null);
    }

    @Test(expected = EmptyStackException.class)
    public void testNoNumberInArray() throws Exception {
        List numberArray = Lists.newArrayList();
        largestNo.largestNumber(numberArray);

    }

    @Test
    public void testOnlyOneNumberInArray() throws Exception {

        assertEquals("Should return passed single number",1,largestNo.largestNumber(Lists.newArrayList(1)));
    }

    @Test
    public void testLargestOfThreeNumbersInArray() throws Exception {
        assertEquals("Should return passed single number",19,largestNo.largestNumber(Lists.newArrayList(4,19,9,18)));
    }

    @Test
    public void testLargestOfNegativeNumbersInArray() throws Exception {
        assertEquals("Should return passed single number",-9,largestNo.largestNumber(Lists.newArrayList(-14,-19,-9,-18)));
    }

}
