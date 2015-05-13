package com.designpattern.main;

import com.designpattern.factory.Game;
import com.designpattern.factory.GameFactory;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by binita on 10/02/15.
 */
public class RunFactory {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the type of Game you wish to play 1.Action 2.Cartoon 3.Running");
        Scanner sc = new Scanner(System.in);
        GameFactory factory = new GameFactory();
        outputGame(factory.getGameFromGenre(sc.nextLine()));
    }

    private static void outputGame(Game gameFromGenre) {

        System.out.println("Game name "+gameFromGenre.getGameName());
        System.out.println("Game is "+gameFromGenre.getGenre());
        System.out.println("Game is "+gameFromGenre.getAction());

    }
}
