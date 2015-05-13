package com.stack;

import java.util.Comparator;

/**
 * Created by binita on 01/03/15.
 */
public interface EStack extends Comparator,Comparable{

    String pop();
    void push(String element);
    String peak();
    boolean isFull();
    int getSize();
}
