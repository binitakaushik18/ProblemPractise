package com.fibonacci;

/**
 * Created by binita on 05/03/15.
 */
public class FibonacciImpl implements Fibonacci {
    @Override
    public int fibonacci(int n) {
        int result = 0;
        if(n<0){
            throw new IllegalArgumentException("Negative no not allowed");
        }
        if(n<=1){
            return n;
        }
        else{
            result = (n-1)+(n-2);
        }
        return result;
    }
}
