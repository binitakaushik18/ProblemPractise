package com.primeno;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by binita on 11/03/15.
 */
public class PrimeNumberImpl implements PrimeNumber {
    @Override
    public boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

    @Override
    public List<Integer> calculatePrime(int startRange, int endRange) {
        List<Integer> primeNumberList = Lists.newArrayList();

        for (int i = startRange; i < endRange; i++) {
            if (isPrime(i)) {
                primeNumberList.add(i);
            }
        }
        return primeNumberList;
    }


}
