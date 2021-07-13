package com.company;

public class Main {


    public static int[][] generateMatrix(int x, int y, int range){
        int[][] matrix = new int[x][y];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * (range + 1));
            }
        }
        return matrix;
    }

    public static void printMatrix(int x, int y, Matrix matrix){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.format("%s ", matrix.getElement(i,j));
            }
            System.out.println();
        }

        System.out.println();
    }







    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int [][] matrix = generateMatrix(x, y,100);

        Matrix matrixImpl = new MatrixImpl(matrix);
        Matrix matrixTransposed = new MatrixTransposed(matrixImpl);
        Matrix matrixSum = new MatrixSum(matrixImpl, matrixTransposed);
        Matrix matrixAllOperation = new MatrixSum(matrixSum, new MatrixSum( new MatrixTransposed(new MatrixImpl(matrix)), new MatrixImpl(matrix)));

        printMatrix(x , y, matrixImpl);
        printMatrix(x , y, matrixTransposed);
        printMatrix(x , y, matrixSum);
        printMatrix(x, y, matrixAllOperation);


    }
}