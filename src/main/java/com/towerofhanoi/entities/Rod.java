package com.towerofhanoi.entities;

import com.towerofhanoi.rules.HanoiRules;

import java.util.Comparator;
import java.util.Stack;

/**
 * Created by binita on 01/03/15.
 */
public class Rod implements HanoiRules{

    Stack<Disk> rod =  new Stack<Disk>();
    int index = 0;
    /*public Rod()
    {
        this.rod = new Stack<Disk>();
    }*/
    public Stack<Disk> getRod() {
        return rod;
    }

    public void setRod(Stack<Disk> rod) {
        this.rod = rod;
    }

    public Disk getCurrentDisk() {
        return rod.peek();
    }

    public void addDisk(Disk disk){
        rod.push(disk);
    }

    public Disk popTopDisk(){
        return rod.pop();
    }
    public int getSize(){
       return rod.size();
    }


     public void moveDiskRule(Rod destRod) throws IllegalArgumentException {

        //valid move
         if(destRod.getSize()==0) {
             Disk disk = this.getRod().pop();
             destRod.addDisk(disk);
         }
         else if(destRod.getSize()>1){
             if (destRod.getCurrentDisk().getDiskSize() > this.getCurrentDisk().getDiskSize()) {

                 Disk disk = getRod().pop();
                 destRod.addDisk(disk);

             }
         }

        else
        {
            throw new IllegalArgumentException("Operation not allowed");
        }
    }
/*
    @Override
    public int compareTo(Object o) {
        Rod rod = (Rod) o;

        rod.getCurrentDisk().getDiskSize()
      //  this.getCurrentDisk().getDiskSize()rod.getCurrentDisk().getDiskSize();
    }*/
}
