package com.designpattern.factory;

/**
 * Created by binita on 10/02/15.
 */
public class AngryBirds implements Game {
    @Override
    public String getGameName() {
        return "Angry Birds";
    }

    @Override
    public String getGenre() {
        return "Cartoon";
    }

    @Override
    public String getAction() {
        return getGameName() + " throwing stones";
    }
}
