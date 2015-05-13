package com.calculator;

import com.calculator.parser.Operation;
import org.apache.commons.lang.StringUtils;

/**
 * Created by binita on 03/03/15.
 */
public class OperationAdd implements Operation {


    @Override
    public double calculate(String expression) {
        String[] number = StringUtils.split(expression, "+");
        Long number1 = Long.parseLong(number[0]);
        Long number2 = Long.parseLong(number[1]);

        return Math.addExact(number1, number2);
    }
}
