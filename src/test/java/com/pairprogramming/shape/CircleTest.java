package com.pairprogramming.shape;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 04/03/15.
 */
public class CircleTest {

    @Test
    public void testZeroRadius() throws Exception{
        try {
            new Circle(0);
            fail("should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Negative or zero radius not allowed",e.getMessage());
        }
    }

    @Test
    public void testNegativeInvalidRadius() throws Exception {
        try{
            new Circle(-8);
            fail("should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Negative or zero radius not allowed",e.getMessage());
        }
     }

    @Test
    public void testSimpleValidCircle() throws Exception {
        Circle circle = new Circle(9);
        assertEquals("Area should be 81",254,circle.getArea(),1.0);
        assertEquals("Perimeter should be 55", 56, circle.getPerimeter(), 1.0);

    }

    @Test
    public void testFloatingPointValidCircle() throws Exception {
        Circle circle = new Circle(1.1);
        assertEquals("Area should be 1.21",4.0,circle.getArea(),0.9);
        assertEquals("Perimeter should be 6.8",6.8,circle.getPerimeter(),1.0);

    }

    @Test
    public void testEquals() throws Exception {
        Circle circle = new Circle(4);
        assertTrue("Should be equal for same object",circle.equals(circle));
        assertFalse("Should return false for null object",circle.equals(null));
        assertFalse("Should return false for different object",circle.equals(new Object()));
        assertTrue("should return true for different object with same value", circle.equals(new Circle(4)));

    }

    @Test
    public void testHashcode() throws Exception {
        Circle circle = new Circle(4);
        assertTrue("Should be true for same object",circle.hashCode()==circle.hashCode());
        assertTrue("should return true for different object with same value",circle.hashCode()==new Circle(4).hashCode());


    }
}
