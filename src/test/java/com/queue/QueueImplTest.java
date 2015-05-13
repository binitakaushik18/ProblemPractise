package com.queue;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.commons.lang.ObjectUtils;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by binita on 01/03/15.
 */
public class QueueImplTest {
    EQueue queue = null;

    @Before
    public void setUp() throws Exception {
    queue = new QueueImpl(5);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructNegativeQueue() throws Exception {
        EQueue queue = new QueueImpl(-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyValueInQueue() throws Exception {
        queue.enqueue(null);
    }

    @Test
    public void testenQueue() throws Exception {
        queue.enqueue("Ishanvi");
        assertEquals("should be equal","Ishanvi",queue.dequeue());
    }

    @Test
    public void testFIFODequeue() throws Exception {
        queue.enqueue("new");
        queue.enqueue("Ishu");
        assertEquals("should be equal", "new", queue.dequeue());
        assertEquals("should be equal","Ishu",queue.dequeue());

    }

    @Test(expected = NullPointerException.class)
    public void testEmptyDequeue() throws Exception {
        queue.dequeue();
    }

    @Test
    public void testMultipleDequeue() throws Exception {
        queue.enqueue("Ishanvi");
        assertEquals("should be equal", "Ishanvi", queue.dequeue());
        try{
            queue.dequeue();
        }
        catch(NullPointerException e){
            //expected
        }

    }

}
