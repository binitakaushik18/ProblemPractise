package com.designpattern.uniquecharacter;

import com.google.common.collect.Maps;
import org.apache.commons.lang.StringUtils;
import org.hamcrest.core.IsNull;

import java.util.Map;

/**
 * Created by binita on 25/02/15.
 * Implement an algorithm to determine if a string has all unique characters. What if you
   can not use additional data structures?
 */
public class UniqueCharacterString {

    public boolean testUniqueCharacters(String sample) {
        Map<Character,Integer> uniqueString = Maps.newHashMap();

        if(sample != null){
        if (StringUtils.isNotEmpty(sample)) {
            char[] characterArray = sample.toCharArray();
            for (char character : characterArray) {
                if(uniqueString.containsKey(character))
                {
                    return false;
                }
                else {
                    uniqueString.put(character, 1);
                }
            }

        }}
        else{
            return false;
        }
        return true;
    }
}
