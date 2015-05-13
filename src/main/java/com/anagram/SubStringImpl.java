package com.anagram;

import org.apache.commons.lang.StringUtils;

import java.util.EmptyStackException;

/**
 * Created by binita on 02/03/15.
 */
public class SubStringImpl implements SubString {


   /*public boolean isSubstring(String parent, String child, int startFrom) {
        if (StringUtils.isBlank(parent) || StringUtils.isBlank(child)) {
            throw new IllegalArgumentException("Null or empty value is passed");
        }

        Character childChar = child.charAt(startFrom);
        for (int i = startFrom; i < parent.length(); i++) {
            Character parentChar = parent.charAt(i);
            if (childChar.equals(parentChar)) {
                return (startFrom == child.length() - 1) ? true : isSubstring(parent, child, ++startFrom);
            }
        }
        return false;
    }*/

    // not using recursion
    @Override
    public boolean isSubstring(String parent, String child) {
        if (StringUtils.isBlank(parent) || StringUtils.isBlank(child)) {
            throw new IllegalArgumentException("Null or empty value is passed");
        }

        for (int j = 0; j < child.length(); j++) {
            for (int i = j; i < parent.length(); i++) {

                Character parentChar = parent.charAt(i);
                Character childChar = child.charAt(j);

                if (childChar.equals(parentChar)) {
                    if (j == child.length() - 1) {
                        return true;

                    }
                j++;
                }
            }
            return false;
        }
        return false;
    }


    /*@Override
    public boolean isSubstring(String parent, String child) {
        return isSubstring(parent, child, 0);
    }*/
    @Override
    public boolean isRotation(String parent, String child) {
        if (StringUtils.isNotBlank(parent) && StringUtils.isNotBlank(child)) {
            StringBuilder reverseString = new StringBuilder();

            if (parent.length() == child.length()) {
                for (int j = parent.length() - 1; j >= 0; j--) {
                    reverseString.append(parent.charAt(j));
                }
                if (reverseString.toString().equals(child)) {
                    return true;
                }

            }
        } else {
            throw new IllegalArgumentException("Null or empty value is passed");
        }
        return false;
    }

}



