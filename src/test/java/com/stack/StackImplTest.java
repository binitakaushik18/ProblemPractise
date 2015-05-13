package com.stack;


import com.google.common.collect.Lists;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.fail;

/**
 * Created by binita on 19/02/15.
 */
public class StackImplTest {

    EStack stack = null;

     @Before
     public void setUp()
     {
           stack = new StackImpl(10);

     }

     @Test(expected = EmptyStackException.class)
     public void testEmptyPop() throws Exception {
         stack.pop();

     }

    @Test
    public void testPush() throws Exception {
        String value = "Ishanvi";
        stack.push(value);

        assertEquals("should be equal", value, stack.peak());

        // TODO: to test peak, after you peak make sure value still exists
    }

    @Test
    public void testPeak() throws Exception {
        String value = "Ishanvi";
        stack.push(value);
        TestCase.assertEquals("should be equal",value,stack.peak());
        //peak should not remove the value so check that you can pop
        TestCase.assertEquals("should be equal",value,stack.pop());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyPush() throws Exception {
    String value = null;
        stack.push(value);

    }

    @Test
    public void testPop() throws Exception {
        stack.push("Prabin");

        assertEquals("Should be equal to pushed value", "Prabin", stack.pop());
    }

    @Test
    public void testMultiplePop() throws Exception {
        stack.push("Prabin");

        assertEquals("Should be equal to pushed value", "Prabin", stack.pop());

        try{
            stack.pop();
        }
        catch (EmptyStackException e){
            //expected

        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateEmptyStack() throws Exception {
        EStack stack = new StackImpl(0);


    }

    @Test
    public void testIsStackFull() throws Exception {
        stack.push("Ishanvi");
        stack.push("Ishanvi");
        stack.push("Ishanvi");
        stack.push("Ishanvi");
        stack.push("Ishanvi");
        stack.push("Ishanvi");
        stack.push("Ishanvi");
        stack.push("Ishanvi");
        stack.push("Ishanvi");
        stack.push("Ishanvi");
       // stack.push("Ishanvi");
        assertTrue(stack.isFull());


        // TODO: stack full throws exception needs testing
        //TODO: Creating stack with 0 size?
        //TODO:Test FIFO
   }

    @Test
    public void testLIFOStackOperation() throws Exception {
        stack.push("Ishanvi");
        stack.push("Kulkarni");
        assertEquals("should be kulkarni", "Kulkarni", stack.pop());
        assertEquals("should be ishanvi","Ishanvi",stack.pop());

    }

    @Test
    public void testCompareMethod() throws Exception {
       EStack stack2 = new StackImpl(9);
        assertEquals(1, stack.compare(stack, stack2));
    }

    @Test
    public void testCompareToMethod() throws Exception {
        EStack stack2 = new StackImpl(11);
        assertEquals(1, stack2.compareTo(stack));

    }

    @Test
    public void testCollectionSort() throws Exception {
        List<EStack> stackList = Lists.newArrayList();
        stackList.add(stack);
        stackList.add(new StackImpl(8));
        stackList.add(new StackImpl(4));
        Collections.sort(stackList);
        assertEquals("should be equal",stackList.get(0).getSize(),4);
        assertEquals("should be equal",stackList.get(1).getSize(),8);
        assertEquals("should be equal",stackList.get(2).getSize(),10);

    }
}
