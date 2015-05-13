package com.designpattern.factory;

/**
 * Created by binita on 10/02/15.
 */
public class GameFactory  {

    public Game getGameFromGenre(String genre)
    {
        if(genre.equalsIgnoreCase("1")) {
            return new MafiaWars();
        }
        if(genre.equalsIgnoreCase("2")) {
            return new AngryBirds();
        }
        if(genre.equalsIgnoreCase("3")) {
            return new TempleRun();
        }
        return null;
    }
}
