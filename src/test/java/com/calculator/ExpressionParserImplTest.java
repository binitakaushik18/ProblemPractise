package com.calculator;

import com.calculator.parser.ExpressionParserImpl;
import com.calculator.parser.ExpressionParser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by binita on 03/03/15.
 */
public class ExpressionParserImplTest {
    ExpressionParser parser = null;

    @Before
    public void setUp() throws Exception {
        parser = new ExpressionParserImpl();

    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullExpression() throws Exception {
        parser.checkValid(null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperatorFirst() throws Exception {
        // only negative allowed before a number
        parser.checkValid("-23");

    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoOperator() throws Exception {
        parser.checkValid("234");


    }


    @Test
    public void testValidOperator() throws Exception {
        assertTrue(parser.checkValid("2+6"));

    }

    @Test
    public void testValidComplexOperator() throws Exception {
        assertTrue(parser.checkValid("-2+6"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testOnlyOperators() throws Exception {
        parser.checkValid("*+*");
    }

    @Test
    public void testValidOperators() throws Exception {
        parser.checkValid("3+5");

    }
}

