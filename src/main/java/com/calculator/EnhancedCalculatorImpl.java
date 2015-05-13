package com.calculator;

import com.calculator.parser.Operation;
import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EnhancedCalculatorImpl implements EnhancedCalclutator, Operation {
    @Override
    public double calculate(String expression) {
        if (StringUtils.isBlank(expression)) {
            throw new IllegalArgumentException("Invalid parameters specified");
        }
        Stack<String> calculateStack = parseExpression(expression);
         double result = 0;
        for(int i=0;i<calculateStack.size();i++){
           // int number =
       /*     if(isOperator(element)){

            }*/
        }
        return result;
    }

  public boolean isOperator(String checkOperator){


      return checkOperator.equals("+") || checkOperator.equals("-") ||
              checkOperator.equals("/") || checkOperator.equals("*");
  }

    public Stack<String> parseExpression(String expression) {
        Stack<String> expressionStack = new Stack<>();

        validateExpression(expression);

        char[] expressionArray = expression.toCharArray();


        for (char character : expressionArray) {

            switch (character) {
                case '+':
                case '-':
                case '/':
                case '*':
                    expressionStack.push(String.valueOf(character));
                    break;

                case '(':
                    expressionStack.push(String.valueOf(character));
                    break;
                case ')':
                    StringBuilder resultString = new StringBuilder();
                    while (!expressionStack.peek().equals(String.valueOf('('))) {
                        resultString.append(expressionStack.pop());
                    }
                    if (expressionStack.peek().equals(String.valueOf('('))) {
                        //do nothing
                        expressionStack.pop();
                    }

                    expressionStack.push(String.valueOf(calculateString(resultString.toString())));
                    break;
                default:
                    if (expressionStack.isEmpty()) {
                        expressionStack.push(String.valueOf(character));
                    } else {
                        if (expressionStack.peek().matches("[0-9]")) {
                            String number = expressionStack.pop();
                            number += character;
                            expressionStack.push(number);
                        }
                        else{
                            expressionStack.push(String.valueOf(character));
                        }
                    }
            }
        }
        return expressionStack;
    }

    private boolean validateExpression(String expression) {
        return true;
    }

    private double calculateString(String calculateExpression) {

        char[] characterArray = calculateExpression.toCharArray();

        double result = 0;

        for(int i=0;i<characterArray.length;i++){
            if(characterArray[i]=='+') {
                result += Math.addExact(Character.getNumericValue(characterArray[i - 1]), Character.getNumericValue(characterArray[i+1]));
                i++;
            }
            if(characterArray[i]=='-') {
                result += Math.subtractExact(Character.getNumericValue(characterArray[i - 1]), Character.getNumericValue(characterArray[i+1]));
                i++;
            }
            if(characterArray[i]=='*') {
                result += Math.multiplyExact(Character.getNumericValue(characterArray[i - 1]), Character.getNumericValue(characterArray[i+1]));
                i++;
            }
            if(characterArray[i]=='/') {
                result += Math.floorDiv(Character.getNumericValue(characterArray[i - 1]), Character.getNumericValue(characterArray[i+1]));
                i++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        EnhancedCalculatorImpl imple = new EnhancedCalculatorImpl();
        System.out.println("result will be 20 = " + imple.calculate("10+(2*9)-1"));
    }
}
