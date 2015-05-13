package com.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by binita on 12/02/15.
 */
public class ConsumerObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {

    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        ConsumerObserver observer = new ConsumerObserver();
        producer.addObserver(observer);
        producer.notifyAll();
    }
}
