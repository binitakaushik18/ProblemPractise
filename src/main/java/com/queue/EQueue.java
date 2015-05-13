package com.queue;

/**
 * Created by binita on 01/03/15.
 */
public interface EQueue<E> {
    void enqueue(String value);
    String dequeue();
}
