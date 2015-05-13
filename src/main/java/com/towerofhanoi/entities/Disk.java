package com.towerofhanoi.entities;

/**
 * Created by binita on 01/03/15.
 */
public class Disk {


    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }


    private int diskSize;

    public Disk(int diskSize) {
        this.diskSize = diskSize;
    }
}
