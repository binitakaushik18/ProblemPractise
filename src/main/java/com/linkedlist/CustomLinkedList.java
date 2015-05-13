package com.linkedlist;

import org.apache.commons.lang.StringUtils;

/**
 * Created by binita on 10/03/15.
 */
public class CustomLinkedList {

    private Node head;
    private int elementCount;

    public CustomLinkedList(Node head) {
        this.head = head;
    }

    public void addToLinkedList(Node addNode) {
        if (addNode==null || StringUtils.isBlank(addNode.getData().toString())) {
            throw new IllegalArgumentException("Empty data not allowed");
        }
        Node currentNode = head;
        Node nextNode ;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(addNode);
        elementCount++;
    }



    public void deleteNode(Node deleteNode) {
        Node currentNode = head;

        if (currentNode.equals(deleteNode)) {
            currentNode = currentNode.getNext();
            head = currentNode;
            return;
        }

        while (currentNode.getNext() != null) {
            if (currentNode.getNext().equals(deleteNode)){
                currentNode.getNext().setNext(null);
                currentNode.setNext(currentNode.getNext().getNext());
                 return;
            }
            currentNode = currentNode.getNext();
        }
        if(currentNode.equals(deleteNode)){
            currentNode = null;
        }

    }

    public Node getNode(String searchString){

        Node currentNode = head;
        if(currentNode.getData().equals(searchString))
        {
            return currentNode;
        }
        while(currentNode.getNext() != null){
            currentNode = currentNode.getNext();
            if(currentNode.getData().equals(searchString)){
                return currentNode;
            }
        }
        return null;
    }

    public Node getHead() {
        return head;
    }

    public int size() {
        return elementCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomLinkedList)) return false;

        CustomLinkedList that = (CustomLinkedList) o;

        if (elementCount != that.elementCount) return false;
        if (head != null ? !head.equals(that.head) : that.head != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = head != null ? head.hashCode() : 0;
        result = 31 * result + elementCount;
        return result;
    }
}
