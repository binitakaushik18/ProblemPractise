package com.primeno;

import java.util.List;

/**
 * Created by binita on 11/03/15.
 */
public interface PrimeNumber {
    boolean isPrime(int number);
    List<Integer> calculatePrime(int startRange, int endRange);
}
