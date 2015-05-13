package com.binarytree;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by binita on 08/03/15.
 */
public class BinaryTreeImplTest {
    BinaryTree tree = null;

    @Before
    public void setUp() throws Exception {
        tree= new BinaryTreeImpl();

    }

    @Test
    public void testBinaryTreeWithRootNodeHavingZero() throws Exception {

        Integer[] binaryTree = new Integer[]{0,1,2,3,4,-7,-6,-5,-4,-2};
        for(Integer element:binaryTree){
            assertTrue("element should be inserted and should return true",tree.add(element));
        }

    }


    @Test
    public void testTreeHavingSameValue() throws Exception {
        assertTrue("should return true",tree.add(1));
        assertFalse("should return false", tree.add(1));
        assertFalse("should return false", tree.add(1));
    }



    @Test
    public void testInorder() throws Exception {
        List<Integer> binaryTree = Lists.newArrayList(7, 1, 2, 3, 4, 5, 6, 0, 8, 9, 10);
        for(Integer element:binaryTree){
            assertTrue("element should be inserted and should return true",tree.add(element));
        }
        assertEquals("Root node should be 0",new Integer(7),tree.getRootNode().getValue());

        assertEquals("inorder", Lists.newArrayList(0,1,2,3,4,5,6,7,8,9,10), tree.getRootNode().inorder());
    }


}
