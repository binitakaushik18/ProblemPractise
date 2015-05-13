package com.towerofhanoi.rules;

import com.towerofhanoi.entities.Disk;
import com.towerofhanoi.entities.Rod;

/**
 * Created by binita on 01/03/15.
 */
public interface HanoiRules {
    void moveDiskRule(Rod destRod) throws IllegalArgumentException;
}
