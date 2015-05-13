package com.anagram;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by binita on 02/03/15.
 */
public class SubStringImplTest {

    SubString substringImpl = null;

    @Before
    public void setUp() throws Exception {
    substringImpl = new SubStringImpl();

    }

    //chck isSubstring impl and check rotationImpl
    @Test(expected = IllegalArgumentException.class)
    public void testBothNullComparison() throws Exception {

        assertFalse(substringImpl.isSubstring(null,null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParentNull() throws Exception {
        assertFalse(substringImpl.isSubstring(null,"Isha"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testChildNull() throws Exception {
        assertFalse(substringImpl.isSubstring("Isha",null));


    }

    @Test(expected = IllegalArgumentException.class)
    public void testParentEmpty() throws Exception {
        assertFalse(substringImpl.isSubstring("","Isha"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testChildEmpty() throws Exception {
        assertFalse(substringImpl.isSubstring("Isha",""));


    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptySubstring() throws Exception {
        assertFalse(substringImpl.isSubstring("",""));

    }

    @Test
    public void testInvalidDataSubstring() throws Exception {
        assertFalse(substringImpl.isSubstring("Prasad", "kul"));

    }

    @Test
    public void testValidDataFromStart() throws Exception {
        assertTrue(substringImpl.isSubstring("Ishanvi","Isha"));

    }
    @Test
    public void testValidDataFromEnd() throws Exception {
        assertTrue(substringImpl.isSubstring("Ishanvi","anvi"));

    }
    @Test
    public void testValidDataInMiddle() throws Exception {
        assertTrue(substringImpl.isSubstring("Ishanvi","han"));

    }

    @Test
    public void testValidDataSpecialCase() throws Exception {
        assertFalse(substringImpl.isSubstring("abcd","xcd"));

    }
    @Test
    public void testValidData2SpecialCase() throws Exception {
        assertFalse(substringImpl.isSubstring("prasad","sab"));

    }

    @Test
    public void testSingleData() throws Exception {
        assertTrue(substringImpl.isSubstring("Ishanvi","a"));

    }
}
