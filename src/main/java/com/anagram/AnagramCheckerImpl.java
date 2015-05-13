package com.anagram;

import org.apache.commons.lang.StringUtils;

import java.util.Collections;

/**
 * Created by binita on 18/04/15.
 */
public class AnagramCheckerImpl implements AnagramChecker{
    @Override
    public boolean testAnagram(String baseString, String testString) {
        if(StringUtils.isBlank(baseString) || StringUtils.isBlank(testString)){

            throw new IllegalArgumentException("Null or empty string not allowed");
        }
        if(baseString.length() !=testString.length()){
        return false;
        }
      //  Collections.sort();
        //if(baseString.)
        return false;

    }
}

