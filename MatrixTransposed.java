package hw.decorator;

public class MatrixTransposed implements Matrix{

    private final int[][] matrix;

    public MatrixTransposed(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return matrix[j][i];
    }
}
