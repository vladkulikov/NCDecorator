package hw.decorator;

public class MatrixSum implements Matrix{
    private final Matrix matrix1;
    private final Matrix matrix2;

    public MatrixSum(Matrix matrix1, Matrix matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }



    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return matrix1.getElement(i, j) + matrix2.getElement(i, j);
    }
}
