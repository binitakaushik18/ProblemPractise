package com.matrix;

/**
 * Created by binita on 09/04/15.
 *  * Write an algorithm such that if an element in an MxN matrix is 0, its entire row an
 *    column is set to 0.
 */
public class MatrixZeroSetterImpl implements MatrixZeroSetter {

    @Override
    public int[][] setConditionalZero(int[][] matrix) {
        if(matrix==null) {
            throw new IllegalArgumentException("Null arguments passed");
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == 0) {
                    setMatrixToZero(matrix);
                }
            }
        }
        return matrix;
    }


    public int[][] setMatrixToZero(int[][] matrixToZero) {
        for (int row = 0; row < matrixToZero.length; row++) {
            for (int column = 0; column < matrixToZero[row].length; column++) {
                matrixToZero[row][column] = 0;
            }
        }
        return matrixToZero;
    }

}
