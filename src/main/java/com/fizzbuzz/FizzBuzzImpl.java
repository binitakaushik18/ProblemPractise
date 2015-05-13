package com.fizzbuzz;

/**
 *  Create a class (FizzBuzz) with the following interface:
 String answer(int number);
 The answers should be as follows:
 If the number is divisible by three, the answer should be “fizz”
 If the number is divisible by five, the answer should be “buzz”
 If the number is divisible by both, the answer should be “fizzbuzz”
 Otherwise the answer should be the the number as a string.

 * Created by binita on 04/03/15.
 */
public class FizzBuzzImpl implements FizzBuzz {

    @Override
    public String answer(int number) {
        StringBuilder answer = new StringBuilder();

        if(number==0) {
           return "0";
        }

        if(number%3==0) {
            answer.append("fizz");
        }
        if(number%5==0){
            answer.append("buzz");
        }
        if(number%3!=0 && number%5!=0)
        {
            answer.append(String.valueOf(number));

        }
        return answer.toString();
    }
}
