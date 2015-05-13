package com.gcd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by binita on 06/03/15.
 */
public class CalculateGCDImpl implements CalculateGCD {
    @Override
    public int calcGCD(int number1, int number2) {
        if(number1<=0 || number2<=0)
        {
            throw new IllegalArgumentException("Cannot calculate GCD for zero or negative numbers");
        }

        List<Integer> num1Factors = calculateFactor(number1);
        List<Integer> num2Factors = calculateFactor(number2);


            for(int i = 0;i<num1Factors.size();i++){
                if(num2Factors.contains(num1Factors.get(i))){
                    return num1Factors.get(i);
                }


        }
        return 1;
    }

    private List<Integer> calculateFactor(int number1) {

        double result = 0;
        List<Integer> resultList = new ArrayList<>();

        for(int i=1;i<=number1;i++){

            result = (double)number1/i;

            if(result==Math.ceil((double)number1/i)){
                resultList.add((int)result);
            }
        }
        return resultList;
    }
}
