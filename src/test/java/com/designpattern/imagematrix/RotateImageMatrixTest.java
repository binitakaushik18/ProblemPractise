package com.designpattern.imagematrix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by binita on 26/02/15.
 */
public class RotateImageMatrixTest {

    public RotateImageMatrix rotateImageMatrix = null;

    @Before
    public void setUp() throws Exception {
        rotateImageMatrix = new RotateImageMatrix();

    }

    @Test
    public void testRotateIdentityMatrix() throws Exception {
        //Integer martrixList[][]= {4,5};

        //matrixList{4,5};
    }

    @Test
    public void testRotateMatrixHavingZero() throws Exception {
        fail();

    }

    @Test
    public void testRotateMatrixHavingNull() throws Exception {
        fail();

    }

    @Test
    public void testRotateMatrixHavingNegativeElements() throws Exception {
        fail();
    }

    @After
    public void tearDown() throws Exception {
        rotateImageMatrix = null;

    }
}
