package com.designpattern.stack;

import java.util.EmptyStackException;

/**
 * Created by binita on 19/02/15.
 */
public class StackImpl implements StackInterface {
    private String[] stackArray;

    public StackImpl(String[] stackArray) {
        this.stackArray = stackArray;
    }

    @Override
    public String pop() throws EmptyStackException {
     /*   if(StringUtil) {
            return stackArray[stackArray.length-1];
        }
        else
        {
            throw new EmptyStackException();
        }*/
return null;
    }

    @Override
    public void put(String s) {
        stackArray[stackArray.length] = s;


    }
}
