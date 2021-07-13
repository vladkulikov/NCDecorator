package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixSumTest {

    @Test
    void getCorrectElement() {

        int[][] masUsual = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] masTransposed = {{1,4,7}, {2,5,8}, {3,6,9}};
        int[][] rezMas = {{2,6,10}, {6,10,14}, {10,14,18}};

        MatrixImpl matrixImpl = new MatrixImpl(masUsual);
        MatrixTransposed matrixTransposed = new MatrixTransposed(matrixImpl);
        MatrixSum matrixSum = new MatrixSum(matrixImpl, matrixTransposed);
        boolean expected = true;
        for (int i = 0; i < rezMas.length; i++){
            for (int j = 0; j < rezMas[i].length;  j++){
                if (rezMas[i][j] != matrixSum.getElement(i, j)){
                    expected = false;
                    break;
                }
            }
        }
        assertTrue(expected);
    }
}