package com.calculator;

import com.calculator.parser.CalculatorControllerImpl;
import com.calculator.parser.ExpressionParser;
import com.calculator.parser.ExpressionParserImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by binita on 03/03/15.
 */
public class CalculatorControllerTest {
    CalculatorController controller = null;
    CalculatorController mockController = null;
    ExpressionParser parser = null;
    @Before
    public void setUp() throws Exception {
        parser = Mockito.mock(ExpressionParserImpl.class);
        controller = new CalculatorControllerImpl(new ExpressionParserImpl());
        mockController = new CalculatorControllerImpl(parser);


    }
/*
    @Test
    public void testController() throws Exception {
        when(parser.checkValid("12+4")).thenReturn(true);
        when(parser.getCalculator("12+4")).thenReturn(new CalculateAdd());
        verify(mockController).calculate("12+4");

    }*/

    @Test
    public void testCalculateAdd() throws Exception {
        assertEquals(controller.calculate("5+4"),9,0);
    }

    @Test
    public void testCalculateSubtract() throws Exception {
        assertEquals(controller.calculate("13-4"),9,0);

    }

    @Test
    public void testCalculateMultiply() throws Exception {
        assertEquals(controller.calculate("3*3"),9,0);
    }

    @Test
    public void testCalculateDivide() throws Exception {
        assertEquals(controller.calculate("90/10"),9,0);

    }
}
