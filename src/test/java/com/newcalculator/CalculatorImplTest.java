package com.newcalculator;

import com.calculator.parser.CalculatorImpl;
import com.gcd.CalculateGCD;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 11/03/15.
 */
public class CalculatorImplTest {
    public Calculator calculator = null;

    /*@Before
    public void setUp() throws Exception {
        calculator = new CalculatorImpl();

    }
*/
    @Test
    public void testCalculateSimpleAdd() throws Exception {
        assertEquals("Should return add result",9,calculator.calculateExpression("6+3"));

    }

    @Test
    public void testSimpleSubtraction() throws Exception {
        assertEquals("should return subtraction result",4,calculator.calculateExpression("9-5"));

    }

    @Test
    public void testSimpleMultiply() throws Exception {
        assertEquals("should return multiplied result 18",18,calculator.calculateExpression("3*6"));

    }

    @Test
    public void testSimpleDivide() throws Exception {
        assertEquals("should return result after divider",4,calculator.calculateExpression("16/4"));

    }

    @Test
    public void testComplexOperation() throws Exception {
        assertEquals("should return result 36",36,calculator.calculateExpression("5+(24*3)-5/2"));

    }

    @Test(expected = InvalidArgumentException.class)
    public void testCalculateWithGarbageString() throws Exception {

        calculator.calculateExpression("5$(24!3)@5/2");

    }
}
