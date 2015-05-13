package com.binarytree;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by binita on 07/03/15.
 */
public class BinaryTreeImpl implements BinaryTree {
    private BinaryNode root;


    public BinaryTreeImpl(){
        root = null;
    }
    public BinaryTreeImpl(Integer rootValue) {

        this.root = new BinaryNode(rootValue);
    }

    @Override
    public boolean add(Integer element) {
        if (root == null) {
            root = new BinaryNode(element);
            return true;
        }
        if (root.equals(element)) {
            return false;
        }
        return root.add(element);
    }


    @Override
    public BinaryNode getRootNode() {
     return root;
    }




    public static void main(String[] args) {
        BinaryTreeImpl tree = new BinaryTreeImpl();
        tree.add(1);
        tree.add(9);
        tree.add(0);
        tree.add(3);
        tree.add(2);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(10);
        tree.getRootNode().inorder();





    }



}




















