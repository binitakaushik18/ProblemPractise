package com.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 09/03/15.
 */
public class NodeImplTest {
    Node linkedList=null;

    @Before
    public void setUp() throws Exception{
       linkedList = new Node("setup");
    }

    @Test
    public void testAddNullData() throws Exception{
        try {
            linkedList.setData(null);
            fail("Should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Empty data not allowed",e.getMessage());
        }
    }

    @Test
    public void testAddEmptyString() throws Exception {
        try{
            linkedList.setData("");
            fail("Should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Empty data not allowed",e.getMessage());
        }
    }

    @Test
    public void testAddValidNode() throws Exception{
        linkedList.setData("first node");

    }

    @Test
    public void testAddMultipleNodes() throws Exception {
        fail();

    }

    @Test
    public void testUpdateANode() throws Exception {
        fail();

    }

    @Test
    public void testDeleteANode() throws Exception {
        fail();
    }
}
