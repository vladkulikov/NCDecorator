package com.company;

public class MatrixTransposed implements Matrix{


    private final Matrix matrix;

    public MatrixTransposed(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return matrix.getElement(j, i);
    }
}
