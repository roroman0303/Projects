package com.company;

import java.util.Random;

public class Matrix {
    private int row_count = 1;
    private int col_count = 1;
    int element[][];

    public Matrix (int rows, int cols) {
        row_count = rows;
        col_count = cols;
        element = new int[row_count][col_count];
    }
    public Matrix (int rows, int cols, boolean rnd) {
        if (rnd) {
            row_count = rows;
            col_count = cols;
            element = new int[row_count][col_count];
            Random n = new Random();
            for (int i = 0; i < row_count; i++) {
                for (int k = 0; k < col_count; k++) {
                    element[i][k] = n.nextInt(10);
                }
            }
        }
        else {
            row_count = rows;
            col_count = cols;
            element = new int[row_count][col_count];
        }
    }
    int getRow_count() {
        return row_count;
    }
    int getCol_count() {
        return col_count;
    }
    void setRow_count(int rows) {
        row_count = rows;
    }
    void setCol_count(int cols) {
        col_count = cols;
    }

    public void print () {
        for (int i = 0; i < row_count; i++) {
            for (int k = 0; k < col_count; k++) {
                System.out.print(element[i][k]+" ");
            }
            System.out.print("\n");
        }
    }
    public static Matrix multiply (Matrix first, Matrix second) {
        Matrix result = new Matrix(first.getRow_count(), second.getCol_count());
        for (int i = 0; i < first.getRow_count(); i++)
            for (int j = 0; j < second.getCol_count(); j++)
            { // взяли столбец и строку и поехали складывать:
                result.element[i][j] = 0;// на всякий случай обнуляю будущий элемент
                for (int k = 0; k < first.getCol_count(); k++) {// строка*столбец
                    result.element[i][j] += first.element[i][k] * second.element[k][j];
                }
            }
        return result;
    }
    public static Matrix add (Matrix first, Matrix second) {
        Matrix result = new Matrix(first.getRow_count(), second.getCol_count());
        for (int i = 0; i < first.getRow_count(); i++)
            for (int j = 0; j < second.getCol_count(); j++)
            {
                result.element[i][j] = first.element[i][j] + second.element[i][j];
            }
        return result;
    }
    public static Matrix subtrack (Matrix first, Matrix second) {
        Matrix result = new Matrix(first.getRow_count(), second.getCol_count());
        for (int i = 0; i < first.getRow_count(); i++)
            for (int j = 0; j < second.getCol_count(); j++)
            {
                result.element[i][j] = first.element[i][j] - second.element[i][j];
            }
        return result;
    }
}
