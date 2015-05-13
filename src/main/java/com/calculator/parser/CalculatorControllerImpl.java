package com.calculator.parser;

import com.calculator.CalculatorController;

/**
 * Created by binita on 03/03/15.
 */
public class CalculatorControllerImpl implements CalculatorController {

    private ExpressionParser parser;

    public CalculatorControllerImpl(ExpressionParser parser) {
        this.parser = parser;

    }

    public double calculate(String expression) {
        parser.checkValid(expression);
        return parser.getCalculator(expression).calculate(expression);
    }

}
