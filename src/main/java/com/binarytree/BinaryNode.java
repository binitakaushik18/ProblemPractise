package com.binarytree;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by binita o8/03/15.
 */
public class BinaryNode implements Comparable {
    private Integer value;
    BinaryNode left, right;

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }


    public BinaryNode(Integer root) {
        this.value = root;
    }

    public BinaryNode getNode(Integer value) {
        return this;
    }

    @Override
    public int compareTo(Object o) {
        if (this.value == (Integer) o) {
            return 0;
        } else if (this.value > (Integer) o) {
            return -1;
        } else {
            return 1;
        }


    }

    public Integer getValue() {
        return value;
    }

    public void displayNode() {
        System.out.println(this.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryNode)) return false;

        BinaryNode that = (BinaryNode) o;

        if (left != null ? !left.equals(that.left) : that.left != null) return false;
        if (right != null ? !right.equals(that.right) : that.right != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    public boolean add(Integer element) {

        if (getValue().equals(element)) {
            return false;
        }
        if (element > getValue()) {
            if (getRight() != null) {
                return getRight().add(element);

            } else {
                setRight(new BinaryNode(element));
                return true;
            }

        } else {
            if (getLeft() != null) {
                return getLeft().add(element);
            } else {
                setLeft(new BinaryNode(element));
                return true;
            }

        }

    }

    public List<Integer> inorder() {
        List<Integer> list = Lists.newArrayList();
        if (getLeft() != null) {
            list.addAll(getLeft().inorder());
        }
        list.add(getValue());
        if (getRight() != null) {
            list.addAll(getRight().inorder());


        }return list;
    }
}
