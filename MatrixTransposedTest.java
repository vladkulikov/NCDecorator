package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposedTest {

    @Test
    void getCorrectElement() {
        int[][] mas = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] masTransposed = {{1,4,7}, {2,5,8}, {3,6,9}};
        MatrixTransposed resMas = new MatrixTransposed(new MatrixImpl(mas));
        boolean expected = true;
        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[i].length;  j++){
                if (masTransposed[i][j] != resMas.getElement(i, j)){
                    expected = false;
                    break;
                }
            }
        }
        assertTrue(expected);
    }
}