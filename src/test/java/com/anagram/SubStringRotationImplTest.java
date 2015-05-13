package com.anagram;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by binita on 02/03/15.
 */
public class SubStringRotationImplTest {
    SubString substringImpl = null;

    @Before
    public void setUp() throws Exception {
        substringImpl = new SubStringImpl();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullString() throws Exception {
        assertFalse(substringImpl.isRotation(null, null));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullParentString() throws Exception {
        assertFalse(substringImpl.isRotation(null, "row"));

    }
    @Test(expected = IllegalArgumentException.class)
    public void testNullChildString() throws Exception {
        assertFalse(substringImpl.isRotation("this", null));

    }
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyString() throws Exception {
        assertFalse(substringImpl.isRotation("",""));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyParentString() throws Exception {
        assertFalse(substringImpl.isRotation("", "row"));

    }
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyChildString() throws Exception {
        assertFalse(substringImpl.isRotation("this", ""));

    }

    @Test
    public void testValidReversed() throws Exception {
        assertTrue(substringImpl.isRotation("crow","worc"));

    }

    @Test
    public void testOnlyOneCharMissingInReversed() throws Exception {
        assertFalse(substringImpl.isRotation("crow","orc"));

    }

    @Test
    public void testInvalidDataReversed() throws Exception {
        assertFalse(substringImpl.isRotation("work","create"));

    }
}
