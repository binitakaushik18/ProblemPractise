package com.matrix;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 column is set to 0.
 * Created by binita on 09/04/15.
 *
 */
public class MatrixSetZeroTest {

    public int testMatrix[][];
    public MatrixZeroSetter matrixZeroSetter = null;

    @Before
    public void setUp() throws Exception {
        int m = 2;
        int n = 2;
        testMatrix = new int[m][n];
        matrixZeroSetter = new MatrixZeroSetterImpl();
    }

    @Test
    public void testMatrixWithNoZeroes() throws Exception {

        int testMatrix[][] = {{1,2},{3,4}};
        int resultMatrix[][] = {{1,2},{3,4}};
        assertEquals("Should return the same matrix as there are no zeroes in the matrix ",resultMatrix[0][0],matrixZeroSetter.setConditionalZero(testMatrix)[0][0]);
        assertEquals("Should return the same matrix as there are no zeroes in the matrix ",resultMatrix[0][1],matrixZeroSetter.setConditionalZero(testMatrix)[0][1]);
        assertEquals("Should return the same matrix as there are no zeroes in the matrix ",resultMatrix[1][0],matrixZeroSetter.setConditionalZero(testMatrix)[1][0]);
        assertEquals("Should return the same matrix as there are no zeroes in the matrix ",resultMatrix[1][1],matrixZeroSetter.setConditionalZero(testMatrix)[1][1]);

    }

    @Test
    public void testMatrixWithSomeZeroes() throws Exception {
        int testMatrix[][] = {{1,0},{3,9}};
        int resultMatrix[][] = {{0,0},{0,0}};
        assertEquals("Should return the matrix with all zeroes",resultMatrix[0][0],matrixZeroSetter.setConditionalZero(testMatrix)[0][0]);
        assertEquals("Should return the matrix with all zeroes",resultMatrix[0][1],matrixZeroSetter.setConditionalZero(testMatrix)[0][1]);
        assertEquals("Should return the matrix with all zeroes",resultMatrix[1][0],matrixZeroSetter.setConditionalZero(testMatrix)[1][0]);
        assertEquals("Should return the matrix with all zeroes",resultMatrix[1][1],matrixZeroSetter.setConditionalZero(testMatrix)[1][1]);
    }

    @Test
    public void testMatrixWithAllZeroes() throws Exception {
        int testMatrix[][] = {{0,0},{0,0}};
        int resultMatrix[][] = {{0,0},{0,0}};
        assertEquals("Should return the matrix with all zeroes",resultMatrix[0][0],matrixZeroSetter.setConditionalZero(testMatrix)[0][0]);
        assertEquals("Should return the matrix with all zeroes",resultMatrix[0][1],matrixZeroSetter.setConditionalZero(testMatrix)[0][1]);
        assertEquals("Should return the matrix with all zeroes",resultMatrix[1][0],matrixZeroSetter.setConditionalZero(testMatrix)[1][0]);
        assertEquals("Should return the matrix with all zeroes", resultMatrix[1][1], matrixZeroSetter.setConditionalZero(testMatrix)[1][1]);

    }

    @Test
    public void testInvalidMatrix() throws Exception {
        int testMatrix[][] = null;
        try {
            matrixZeroSetter.setConditionalZero(testMatrix);
            fail("Should not reach here");
        }
        catch(IllegalArgumentException e){
            assertEquals("Should return equal message","Null arguments passed",e.getMessage());
        }
    }
}
