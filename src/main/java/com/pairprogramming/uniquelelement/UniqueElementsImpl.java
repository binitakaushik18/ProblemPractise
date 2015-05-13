package com.pairprogramming.uniquelelement;

import com.google.common.base.Joiner;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by binita on 07/03/15.
 */
public class UniqueElementsImpl implements UniqueElements {
    @Override
    public int getUniqueElementCount(String[] calculateUnique) {
        for (String elements : calculateUnique) {

        }
        return 0;
    }

    private String getHash(String element) {
//element.
        return null;
    }


    public static String reverseString(String str) {
        String reverse = null;
        if (str.length() == 1) {
            return str;
        } else {
            reverse += str.charAt(str.length() - 1)
                    + reverseString(str.substring(0, str.length() - 1));
            return reverse;
        }
    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

    public static String removeDuplicates(String s) {
        HashSet<Character> seenSet = new HashSet<>();
        char[] inputArray = s.toCharArray();

        for (char inputChar : inputArray) {
            seenSet.add(inputChar);
        }
        StringBuilder builder = new StringBuilder();
        Iterator iterator = seenSet.iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next());
        }
        return builder.toString();
    }

    public static String removeDuplicatesWithCharacter(String s) {
        boolean[] seen = new boolean[256];
        char[] inputArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char inputChar : inputArray) {
            if(!seen[inputChar]){
                builder.append(inputChar);
            }
           seen[inputChar] = true;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
  //      System.out.print("" + UniqueElementsImpl.reverse("binita"));
        System.out.print("remove duplicates from ishanvi "+removeDuplicatesWithCharacter("ishanvi"));
    }
}





