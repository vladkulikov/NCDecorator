package hw.decorator;

public class Main {



    public static void main(String[] args) {
        int [][] matrix = new int [3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = (int) (Math.random() * (100 + 1));
            }
        }
        Matrix matrixImpl = new MatrixImpl(matrix);
        Matrix matrixTransposed = new MatrixTransposed(matrix);
        Matrix matrixSum = new MatrixSum(matrixImpl, matrixTransposed);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.format("%s ", matrixImpl.getElement(i,j));
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.format("%s ", matrixTransposed.getElement(i,j));
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.format("%s ", matrixSum.getElement(i,j));
            }
            System.out.println();
        }

    }
}
