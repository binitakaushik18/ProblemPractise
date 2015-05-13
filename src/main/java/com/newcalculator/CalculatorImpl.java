package com.newcalculator;

import java.util.Stack;

/**
 * Created by binita on 11/03/15.
 */
public class CalculatorImpl implements Calculator {
    @Override
    public double calculateExpression(String expression) {
        // calculate for single digit good input
        char[] calculateArray = expression.toCharArray();
        double result = 0;
        Stack<Object> evaluateStack = new Stack<>();

        for(char character:calculateArray) {
           /* if(StringUt)
                evaluateStack.push(character);
        }*/
        }
return 0;

    }

    @Override
    public double calculate(double number1, double number) {
        return 0;
    }
}
