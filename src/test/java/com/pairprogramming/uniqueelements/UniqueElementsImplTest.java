package com.pairprogramming.uniqueelements;

import com.pairprogramming.uniquelelement.UniqueElements;
import com.pairprogramming.uniquelelement.UniqueElementsImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by binita on 07/03/15.
 */
public class UniqueElementsImplTest {
    UniqueElements uniqueElements = null;
    @Before
    public void setUp() throws Exception {
        uniqueElements = new UniqueElementsImpl();

    }

    @Test
    public void testUniqueElementsForNullArray() throws Exception {
        fail();
    }

    //if u find null array or empty array then throw the exception otherwise just log it and move on

    @Test
    public void testUniqueElementsForEMptyArray() throws Exception {
        fail();

    }

    @Test
    public void testUniqueElementsForNoUniqueElements() throws Exception {
        fail();
    }

    @Test
    public void testUniqueElementsForAllUniqueElements() throws Exception {
      fail();
    }

    @Test
    public void testForMoreThanOneUniqueElements() throws Exception {
    fail();
    }

    @Test
    public void testForOneUniqueElements() throws Exception {
        fail();
    }
}
