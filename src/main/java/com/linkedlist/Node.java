package com.linkedlist;

import org.apache.commons.lang.StringUtils;

/**
 * Created by binita on 09/03/15.
 */
public class Node {
    private Node next;
    private String data;

    public Node(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        if (data != null ? !data.equals(node.data) : node.data != null) {return false;}

        return true;
    }

    @Override
    public int hashCode() {
        int result = next != null ? next.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
