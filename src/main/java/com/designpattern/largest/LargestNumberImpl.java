package com.designpattern.largest;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by binita on 24/02/15.
 */
public class LargestNumberImpl implements LargestNumber {
    @Override
    public int largestNumber(List<Integer> array) throws Exception {

        int largestNumber = 0;
        if (array != null && !array.isEmpty()) {
            for (Integer number : array) {
                if (largestNumber < number)
                    largestNumber = number;
            }
        } else {
            throw new EmptyStackException();
        }
        return largestNumber;
    }
}
