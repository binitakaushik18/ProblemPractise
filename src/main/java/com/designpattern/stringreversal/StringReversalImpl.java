package com.designpattern.stringreversal;

import org.apache.commons.lang.StringUtils;

import java.util.StringTokenizer;

/**
 * Created by binita on 20/02/15.
 */
public class StringReversalImpl implements StringReversal {

    @Override
    public String reverseCustom(String originalString) {
        if(StringUtils.isBlank(originalString)){
            throw new IllegalArgumentException("Blank or null string not allowed");
        }
        StringBuilder reversedString = new StringBuilder();
        if(StringUtils.isNotEmpty(originalString)) {
            char[] characterArray = originalString.toCharArray();
            for (int i = characterArray.length - 1; i > -1; i--) {
                reversedString.append(characterArray[i]);
            }
        }
      return reversedString.toString();
    }

    public static void main(String[] args) {
        StringReversalImpl test =  new StringReversalImpl();
        System.out.println(test.reverseCustom("Ishanvi"));
    }
}
