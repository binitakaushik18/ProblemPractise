package com.designpattern.factory;

/**
 * Created by binita on 10/02/15.
 */
public class TempleRun implements Game {
    @Override
    public String getGameName() {
        return "Temple Run";
    }

    @Override
    public String getGenre() {
        return "Running";
    }
    @Override
    public String getAction() {
        return getGameName() + " running fast";
    }
}
