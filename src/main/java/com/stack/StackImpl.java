package com.stack;

import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Node;

import java.util.*;
import java.util.Stack;

/**
 * Created by binita on 01/03/15.
 */
public class StackImpl implements EStack,Comparator,Comparable {

    private int size;
    private String[] stackArray = null;
    private int top = -1;


    public StackImpl(int size) {
        Preconditions.checkArgument(size>0,"Negative size not allowed");
        this.stackArray = new String[size];
        this.size = size;
        this.top = -1;
    }

    @Override
    public String pop()  {

        if (top == -1) {
            throw new EmptyStackException();
        }

        return stackArray[top--];
    }

    @Override
    public void push(String element) {

        if (StringUtils.isNotEmpty(element)) {
            if (top == size - 1) {
                throw new ArrayIndexOutOfBoundsException("Stack is full");
            }else {
                stackArray[++top] = element;
            }
        } else {
            throw new IllegalArgumentException("Null element not allowed");

        }

    }

    public String peak() {
        if(top==-1)
        {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return getSize() - 1 == top;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Object o) {
        StackImpl object1 = (StackImpl)o;
        return this.getSize()-object1.getSize();
    }

    @Override
    public int compare(Object o1, Object o2) {
        StackImpl object1 = (StackImpl)o1;
        StackImpl obj2 = (StackImpl) o2;
        return object1.getSize()-obj2.getSize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StackImpl)) return false;

        StackImpl stack = (StackImpl) o;

        if (size != stack.size) return false;
        if (top != stack.top) return false;
        if (!Arrays.equals(stackArray, stack.stackArray)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + (stackArray != null ? Arrays.hashCode(stackArray) : 0);
        result = 31 * result + top;
        return result;
    }
}
