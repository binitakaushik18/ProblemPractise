package com.pairprogramming.shape;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by binita on 04/03/15.
 */
public class RectangleTest {

    public static final double DEVITATION = 0.0;

    @Test(expected = IllegalArgumentException.class)
    public void testForZeroLengthAndZeroWidth() throws Exception {
        new Rectangle(0.0, 0.0);
    }

    @Test
    public void testForSquareShape() throws Exception {

        Shape rectangle = new Rectangle(5.0, 5.0);
        assertEquals("Area should be 25", 25.0, rectangle.getArea(), DEVITATION);
        assertEquals("Perimeter should be 20", 20.0, rectangle.getPerimeter(), DEVITATION);

    }

    @Test
    public void testForSimpleValidInput() throws Exception {
        Shape rectangle = new Rectangle(5.0, 9.0);
        assertEquals("Area should be 45", 45.0, rectangle.getArea(), DEVITATION);
        assertEquals("Perimeter should be 36", 28.0, rectangle.getPerimeter(), DEVITATION);
    }


    @Test
    public void testRectangleEquals() throws Exception {
        Shape rectangle1 = new Rectangle(5.0,9.0);
        Shape rectangle2 = new Rectangle(5.0,9.0);
        assertFalse("Should return false for null object",rectangle1.equals(null));
        assertFalse("Should return false for different object",rectangle1.equals(new Object()));
        assertTrue("Passing the same object should be equal",rectangle1.equals(rectangle1));
        assertTrue("Passing different object with same length and width should return true",rectangle1.equals(rectangle2));
    }

    @Test
    public void testRectangleHashcode() throws Exception {
        Shape rectangle1 = new Rectangle(5.0,9.0);
        Shape rectangle2 = new Rectangle(5.0,9.0);
        assertTrue("Passing the same rectangle object should return same hashcode",rectangle1.hashCode()==rectangle1.hashCode());
        assertTrue("Passing different rectangle object should return same hashcode", rectangle1.hashCode() == rectangle1.hashCode());

    }

    @Test
    public void testForZeroWidth() throws Exception {
        try {
            new Rectangle(9, 0);
            fail("Should fail for size zero width");
        } catch (IllegalArgumentException e) {
            assertEquals("Zero width not allowed", e.getMessage());
            //expected
        }
   }

    @Test
    public void testForZeroLength() throws Exception {
        try {
            new Rectangle(0, 9);
            fail("Should fail for size zero length");
        } catch (IllegalArgumentException e) {
            assertEquals("Zero length not allowed", e.getMessage());
            // expected
        }
    }

    @Test
    public void testForDecimalValidInput() throws Exception {
        Shape rectangle = new Rectangle(4.4,3.6);
        assertEquals("Area should be ",4.4*3.6,rectangle.getArea(),DEVITATION);
        assertEquals("Perimeter should be ",16,rectangle.getPerimeter(),DEVITATION);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNegativeInvalidInput() throws Exception {
        new Rectangle(-2.0,-7.0);

    }
}
