package com.countdown;

import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by binita on 05/03/15.
 */
public class CountdownImpl implements Countdown {
    @Override
    public int[] countdown(int start) {
        if(start < 0){
            throw new IllegalArgumentException("Negative no not allowed");
        }
        int[] resultArray = new int[start+1];
        int j=0;

        for(int i=start;i>=0;i--){
            resultArray[j]=start--;
            j++;
        }

        return resultArray;
    }


}
