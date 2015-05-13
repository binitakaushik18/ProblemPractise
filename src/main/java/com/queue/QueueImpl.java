package com.queue;

import com.google.common.base.Preconditions;
import org.apache.commons.lang.StringUtils;

import java.util.EmptyStackException;

/**
 * Created by binita on 01/03/15.
 */
public class QueueImpl implements EQueue {
    private int first=-1;
    private int last,size;
    private String[] queueArray = null;

    public QueueImpl(int size){
        Preconditions.checkArgument(size > 0, "Negative size not allowed");
        this.size=size;
        queueArray = new String[size];

        first=-1;
        last=-1;
    }

    @Override
    public void enqueue(String value) {
        if(StringUtils.isNotEmpty(value)) {
            if (first == last & last==-1) {

                queueArray[++last] = value;
                first=last;
                //first element

            } else {
                queueArray[++last] = value;
            }
        }
        else{
            throw new IllegalArgumentException("Empty value not allowed in queue");
        }


        }


    @Override
    public String dequeue() {
    if(last==-1){

           throw new NullPointerException("No values present in the queue");
    }
        return queueArray[first++];
    }
}
