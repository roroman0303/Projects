package com.company;

public class Main {

    public static void main(String[] args) {
        Matrix firstm = new Matrix(3,3,true);
        Matrix secondm = new Matrix(3,3,true);
        firstm.print();
        secondm.print();

        Matrix thirdm = Matrix.multiply(firstm, secondm);
        thirdm.print();// умножение

        Matrix fourthm = Matrix.add(firstm, secondm);
        fourthm.print();// сложение

        Matrix fifthm = Matrix.subtrack(firstm, secondm);
        fifthm.print();// вычитание

        SquareMatrix firsts = new SquareMatrix(2, true);
        firsts.print();
        System.out.println(SquareMatrix.determinant(firsts));
    }
}
