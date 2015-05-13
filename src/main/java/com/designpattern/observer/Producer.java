package com.designpattern.observer;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by binita on 12/02/15.
 */
public class Producer extends Observable {
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();

    }
    
}
