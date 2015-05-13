package com.designpattern.factory;

/**
 * Created by binita on 10/02/15.
 */
public class MafiaWars implements Game {
    @Override
    public String getGameName() {
        return "Mafia Wars";
    }

    @Override
    public String getGenre() {
        return "action";
    }
    @Override
    public String getAction() {
        return getGameName() + " throwing weapons on each other";
    }
}
