package com.romannumerals;


import org.apache.commons.lang.math.NumberUtils;

import java.text.NumberFormat;

/**
 * Created by binita on 05/03/15.
 */
public class RomanNumeralsImpl implements RomanNumerals {
    @Override
    public String convert(int number) {
        StringBuilder romanNumeral = new StringBuilder();

        if(number<=0){
            throw new IllegalArgumentException("Roman numeral does not exist for zero or negative number");
        }

        int ten = Math.floorDiv(number,10);
            number = number - 10*ten;
        while(ten>0){
            romanNumeral.append("X");
            --ten;
        }

        if(number%10==9){
            romanNumeral.append("IX");
            number = number-9;
        }
        int five = Math.floorDiv(number,5);
             number = number - five*5;

        while(five>0){
            romanNumeral.append("V");
            --five;
        }
        if(number%5==1){
            romanNumeral.append("I");
        }
        if(number%5==2){
            romanNumeral.append("II");
        }
        if(number%5==3){
            romanNumeral.append("III");
        }
        if(number%5==4){
            romanNumeral.append("IV");
        }


        return romanNumeral.toString();
    }

}
