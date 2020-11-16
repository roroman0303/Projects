package com.company;

public class SquareMatrix extends Matrix{
    public SquareMatrix (int rows_n_cols) {
        super(rows_n_cols, rows_n_cols);
    }
    public SquareMatrix (int rows_n_cols, boolean rnd) {
        super(rows_n_cols, rows_n_cols, rnd);
    }
    public static int determinant (SquareMatrix matrix) {
        int result = 0;
        if (matrix.getCol_count() == 2) result = det2(matrix);
        if (matrix.getCol_count() == 3) result = det3(matrix);
        return result;
    }
    private static int det2(SquareMatrix matrix) {
        return matrix.element[0][0]*matrix.element[1][1] - matrix.element[1][0]*matrix.element[0][1];
    }
    private static int det3(SquareMatrix matrix) {
        SquareMatrix mat1 = new SquareMatrix(2);
        mat1.element[0][0] = matrix.element[1][1];
        mat1.element[0][1] = matrix.element[1][2];
        mat1.element[1][0] = matrix.element[2][1];
        mat1.element[1][1] = matrix.element[2][2];
        //mat1.print();
        SquareMatrix mat2 = new SquareMatrix(2);
        mat2.element[0][0] = matrix.element[1][0];
        mat2.element[0][1] = matrix.element[1][2];
        mat2.element[1][0] = matrix.element[2][0];
        mat2.element[1][1] = matrix.element[2][2];
        //mat2.print();
        SquareMatrix mat3 = new SquareMatrix(2);
        mat3.element[0][0] = matrix.element[1][0];
        mat3.element[0][1] = matrix.element[1][1];
        mat3.element[1][0] = matrix.element[2][0];
        mat3.element[1][1] = matrix.element[2][1];
        //mat3.print();
        return matrix.element[0][0]*det2(mat1)
                -matrix.element[0][1]*det2(mat2)
                +matrix.element[0][2]*det2(mat3);
    }
}
