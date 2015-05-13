package com.towerofhanoi.player;

import com.towerofhanoi.entities.Disk;
import com.towerofhanoi.entities.Rod;
import com.towerofhanoi.entities.Rods;
import com.towerofhanoi.game.HanoiGame;
import com.towerofhanoi.game.HanoiGameImpl;
import com.towerofhanoi.rules.HanoiRules;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by binita on 01/03/15.
 */
public class Player {

    HanoiGame game;
    List<Rod> rodList;

    public Player(HanoiGame game) {
        this.game = game;

    }
    public void moveDisk(Rod fromrod1, Rod destRod)
    {
        fromrod1.moveDiskRule(destRod);
    }

    public static void main(String[] args) {
        Rods rods = new Rods();
        Rod rod1 = rods.createRod();
        Rod rod2 = rods.createRod();
        Rod rod3 = rods.createRod();
        List<Rod> rodList = new ArrayList<>();
        rodList.add(rod1);
        rodList.add(rod1);
        rodList.add(rod1);
        HanoiGame game = new HanoiGameImpl(rodList);

        Player player = new Player(game);
        player.moveDisk(rod1,rod2);


    }






}
