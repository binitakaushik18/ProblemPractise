package com.calculator.parser;

import com.calculator.OperationAdd;
import com.calculator.OperationDivide;
import com.calculator.OperationMultiply;
import com.calculator.OperationSubtract;
import org.apache.commons.lang.StringUtils;

import java.util.regex.Pattern;

/**
 * Created by binita on 03/03/15.
 */
public class ExpressionParserImpl implements ExpressionParser {

    public static String VALID_EXPRESSION_REGEX = "^[\\d]+[\\(\\)\\+\\-\\*\\/\\.]+[\\d]+$";

    boolean validateExpression(String expression) {

        char[] expressionArray = expression.toCharArray();
        //1st char should be number
        //split into 3 chars
        // there should be 3 chars otherwise illegal argument
        // if char length less than 3 then illegal argument
        if (expressionArray.length < 3) {
            throw new IllegalArgumentException("Incorrect arguments specified");
        }
        if (!Pattern.matches(VALID_EXPRESSION_REGEX, expression)) {
            throw new IllegalArgumentException("Invalid arguments specified");
        }

        return true;
    }


    @Override
    public Operation getCalculator(String calculateExpression) {

        if (calculateExpression.contains("+")) {
            return new OperationAdd();
        } else if (calculateExpression.contains("-")) {
            return new OperationSubtract();
        } else if (calculateExpression.contains("*")) {
            return new OperationMultiply();
        } else {
            return new OperationDivide();
        }

    }

    @Override
    public boolean checkValid(String expression) {
        if (StringUtils.isBlank(expression)) {
            throw new IllegalArgumentException("No entries applied to calculate");
        }
        return validateExpression(expression);
    }
}

