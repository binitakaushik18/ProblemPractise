package com.linkedlist;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by binita on 10/03/15.
 */
public class CustomLinkedListTest
{
    CustomLinkedList linkedList = null;

    @Before
    public void setUp() throws Exception {
        linkedList = new CustomLinkedList(new Node("setup"));

    }

    @Test
    public void testAddToLinkedList() throws Exception {
        assertEquals("Expected size should be zero",0,linkedList.size());
        linkedList.addToLinkedList(new Node("ishu"));
        assertEquals("Expected size should be zero",1,linkedList.size());

    }

    @Test
    public void testAddMultipleToList() throws Exception {

        assertEquals("Expected size should be zero",0,linkedList.size());
        linkedList.addToLinkedList(new Node("ishani"));
        assertEquals("Expected size should be zero",1,linkedList.size());
        linkedList.addToLinkedList(new Node("ishanvi"));
        assertEquals("Expected size should be zero",2,linkedList.size());
        linkedList.addToLinkedList(new Node("binita"));
        assertEquals("Expected size should be zero",3,linkedList.size());
        linkedList.addToLinkedList(new Node("prasad"));
        assertEquals("Expected size should be zero",4,linkedList.size());

    }

    @Test
    public void testAndNullData() throws Exception{
        try {
            linkedList.addToLinkedList(null);
            fail("Should not reach here");
        }
        catch (IllegalArgumentException e){
            assertEquals("Expected size should be zero",0,linkedList.size());
            assertEquals("Empty data not allowed",e.getMessage());
        }
    }

    @Test
    public void testRetrieveNode() throws Exception {
        Node testNode = new Node("testNode");
        linkedList.addToLinkedList(testNode);
        assertEquals("Should be equal", testNode, linkedList.getNode("testNode"));
    }


    @Test
    public void testDeleteHead() throws Exception {
        Node node = new Node("head");
        linkedList.addToLinkedList(node);
        Node nextNode = new Node("node 1 ");
        linkedList.addToLinkedList(nextNode);
        //head node is setup
        linkedList.deleteNode(new Node("setup"));
        assertNull("Deleted node should return null",linkedList.getNode("setup"));

    }


    @Test
    public void testDeleteMiddleNode() throws Exception {
        Node node = new Node("data");
        linkedList.addToLinkedList(node);
        Node node2 = new Node("data2");
        linkedList.addToLinkedList(node2);

        linkedList.deleteNode(node);
        assertNull("Deleted node should return null", linkedList.getNode("data"));


    }

    @Test
    public void testDeleteLastNode() throws Exception {
        Node node = new Node("data");
        linkedList.addToLinkedList(node);
        Node node2 = new Node("data2");
        linkedList.addToLinkedList(node2);

        linkedList.deleteNode(node2);
        assertNull("Deleted node should return null", linkedList.getNode("data2"));

    }
}
