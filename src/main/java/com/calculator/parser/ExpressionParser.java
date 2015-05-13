package com.calculator.parser;

/**
 * Created by binita on 03/03/15.
 */
public interface ExpressionParser {

    boolean checkValid(String expression);

    Operation getCalculator(String expression);

}
