package com.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/*
 * Created by binita on 04/03/15.
*/

public class EnhancedCalculatorImplTest {

    EnhancedCalclutator impl = null;
    @Before
    public void setUp() throws Exception {
        impl = new EnhancedCalculatorImpl();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullInputCalculator() throws Exception {
        impl.calculate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyInputCalculator() throws Exception {
        impl.calculate("");

    }

    @Test(expected = IllegalArgumentException.class)
    public void testOnlyoperatorsCalculator() throws Exception {
        impl.calculate("@#$%#$");
    }

    @Test
    public void testSimpleValidInput() throws Exception {
        assertEquals("Should be equal",45,impl.calculate("5*9"));


    }

    @Test
    public void testSimpleValidInput1() throws Exception {
        assertEquals("Should be equal",47,impl.calculate("5*9+(3-1)"));


    }

    @Test
    public void testComplexValidInput() throws Exception {
        assertEquals(18,impl.calculate("2+(3*3)+(9/1)-2"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidParamInput() throws Exception {
        impl.calculate("(23+9");
    }
}

