package hw.decorator;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixImplTest {

    @Test
    void getCorrectElement() {
        int[][] mas = {{1,2,3}, {4,5,6}, {7,8,9}};
        MatrixImpl resMas = new MatrixImpl(mas);
        boolean expected = true;
        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[i].length;  j++){
                if (mas[i][j] != resMas.getElement(i, j)){
                    expected = false;
                    break;
                }
            }
        }
        assertTrue(expected);
    }
}