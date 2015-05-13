package com.towerofhanoi.game;

import com.towerofhanoi.entities.Rod;
import com.towerofhanoi.entities.Rods;

import java.util.List;

/**
 * Created by binita on 01/03/15.
 * In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different
 sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending
 order of size from top to bottom (e.g., each disk sits on top of an even larger one). You
 have the following constraints:
 (A) Only one disk can be moved at a time.
 (B) A disk is slid off the top of one rod onto the next rod.
 (C) A disk can only be placed on top of a larger disk.
 Write a program to move the disks from the first rod to the last using Stacks.
 */
public class HanoiGameImpl implements  HanoiGame {
    public HanoiGameImpl(List<Rod> rodList) {
        this.rod = rod;
    }

    // initialise game with rods, disks, one player and 1 hanoi setup
   // one rod has all disks
    private List<Rod> rod;

    public void solveHanoiGame(List<Rod> rodList)
    {


    }

}
