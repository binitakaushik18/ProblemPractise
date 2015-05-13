package com.entities;

import com.towerofhanoi.entities.Disk;
import com.towerofhanoi.entities.Rod;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by binita on 01/03/15.
 */
public class RodTest {
    Rod rod1 = null;
    Rod rod2 = null;
    Rod rod3 = null;

    @Before
    public void setUp() throws Exception {
        rod1 = new Rod();
        rod2 = new Rod();
        rod3 = new Rod();

        rod1.addDisk(new Disk(10));
        rod1.addDisk(new Disk(9));
        rod1.addDisk(new Disk(8));
        rod1.addDisk(new Disk(7));
        rod1.addDisk(new Disk(6));
        rod1.addDisk(new Disk(5));
        rod1.addDisk(new Disk(4));
        rod1.addDisk(new Disk(3));
        rod1.addDisk(new Disk(2));
        rod1.addDisk(new Disk(1));

    }

    @Test
    public void testMoveDiskToRod() throws Exception {

        rod1.moveDiskRule(rod2);

        //check current state
        assertEquals("Rod 1 should have 9 disks",rod1.getSize(),9);
        assertEquals("Rod 2 should have 1 disk",rod2.getSize(),1);

        try {
            rod1.moveDiskRule(rod2);
        }
        catch (IllegalArgumentException e){
            //expected
        }
        //checking states
        assertEquals("Rod 1 should have 9 disks",rod1.getSize(),9);
        assertEquals("Rod 2 should have 1 disk",rod2.getSize(),1);


    }



}
