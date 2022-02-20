﻿// Matrix.cpp : Этот файл содержит функцию "main". Здесь начинается и заканчивается выполнение программы.
//
#include <iostream>
#include <string>
using namespace std;

// создаватель двумерного дин. массива 
float** twoDimMatrixCreator(int row_count, int col_count) {
    float** element = new float* [row_count];
    for (int i = 0; i < row_count; i++) element[i] = new float[col_count];
    return element;
}

// класс матриц
class Matrix {
private:
    // кол-во сток и столбцов
    int row_count;
    int col_count;

public:
    float** element;// пока пустой указатель (вскоре в конструкторе станет массивом)
    Matrix(int row_count, int col_count)
    {
        this->row_count = row_count;
        this->col_count = col_count;
        this->element = twoDimMatrixCreator(row_count, col_count);// <- здесь   
    }
    //~Matrix()
    //{
        // удаление двумерного дин. массива из памяти
        //for (int i = 0; i < this->row_count; i++) delete[] element[i];
        //delete[] element;
    //}
    int getRow_count() {
        return this->row_count;
    }
    int getCol_count() {
        return this->col_count;
    }
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // friend istream& operator>> (istream &Mcin, Matrix &matrix);
    // friend ostream& operator<< (ostream &Mcout, Matrix &matrix);
    // friend Matrix operator + (Matrix &matrix1, Matrix &matrix2);
    // friend Matrix operator - (Matrix &matrix1, Matrix &matrix2);
    // friend Matrix operator * (Matrix &matrix1, Matrix &matrix2);
    // если необходимо через friend, то надо в каждой перегружающей функции просто поменять getы на this->
    // и, естественно, раскомментировать код сверху
};

// перегружаем + !ВАЖНО - размеры должны быть одинаковые
Matrix operator + (Matrix& matrix1, Matrix& matrix2)
{
    // берем размерность у одной из матриц (обе одинаковые по размерности, иначе нельзя сложить)
    Matrix matrix_result = Matrix(matrix1.getRow_count(), matrix1.getCol_count());
    for (int i = 0; i < matrix1.getRow_count(); i++)
        for (int j = 0; j < matrix1.getCol_count(); j++)
        { // перебираем и складываем
            matrix_result.element[i][j] = matrix1.element[i][j] + matrix2.element[i][j];
        }
    return matrix_result;
}

// перегружаем - !ВАЖНО - размеры должны быть одинаковые
Matrix operator - (Matrix& matrix1, Matrix& matrix2)
{
    Matrix matrix_result = Matrix(matrix1.getRow_count(), matrix1.getCol_count());
    for (int i = 0; i < matrix1.getRow_count(); i++)
        for (int j = 0; j < matrix1.getCol_count(); j++)
        { // перебираем и вычитаем
            matrix_result.element[i][j] = matrix1.element[i][j] - matrix2.element[i][j];
        }
    return matrix_result;
}

// перегружаем * !ВАЖНО - размер столбцов первой матрицы и строк второй должны совпасть
Matrix operator * (Matrix& matrix1, Matrix& matrix2)
{
    Matrix matrix_result = Matrix(matrix1.getRow_count(), matrix2.getCol_count());
    for (int i = 0; i < matrix1.getRow_count(); i++)
        for (int j = 0; j < matrix2.getCol_count(); j++)
        { // взяли столбец и строку и поехали складывать:
            matrix_result.element[i][j] = 0;// на всякий случай обнуляю будущий элемент
            for (int k = 0; k < matrix1.getCol_count(); k++) {// строка*столбец
                matrix_result.element[i][j] += matrix1.element[i][k] * matrix2.element[k][j];
            }
        }
    return matrix_result;
}
// перегружаем cin (теперь через пробелы надо ввести нужное количество значений)
istream& operator>> (istream& Mcin, Matrix& matrix)
{
    for (int i = 0; i < matrix.getRow_count(); i++)
        for (int j = 0; j < matrix.getCol_count(); j++)
        {
            Mcin >> matrix.element[i][j];
        }
    return Mcin;
}
// перегружаем cout (теперь выводит с пробелами между элементами и с переводом строки)
ostream& operator<< (ostream& Mcout, Matrix& matrix)
{
    for (int i = 0; i < matrix.getRow_count(); i++) {
        Mcout << endl;
        for (int j = 0; j < matrix.getCol_count(); j++)
        {
            Mcout << matrix.element[i][j] << " ";
        }
    }
    return Mcout;
}

int main()
{
    Matrix matrix1 = Matrix(2, 3);
    Matrix matrix2 = Matrix(2, 3);
    Matrix matrix3 = Matrix(3, 2);
    //каждый раз вбивать cin неудобно, поэтому дальше ввожу кодом 
    //
    //
    int counter = 1;
    for (int i = 0; i < matrix1.getRow_count(); i++)
        for (int j = 0; j < matrix1.getCol_count(); j++)
        {
            matrix1.element[i][j] = counter++; // первая по порядку с 1 до 6 (2 на 3)
        }
    for (int i = 0; i < matrix2.getRow_count(); i++)
        for (int j = 0; j < matrix2.getCol_count(); j++)
        {
            matrix2.element[i][j] = --counter; // вторая по порядку с 6 до 1 (2 на 3)
        }
    for (int i = 0; i < matrix3.getRow_count(); i++)
        for (int j = 0; j < matrix3.getCol_count(); j++)
        {
            matrix3.element[i][j] = 1; // третья - единички везде (3 на 2)(для теста умножения)
        }
    cout << matrix1;
    cout << matrix2;
    cout << matrix3;

    Matrix matrix4 = matrix1 + matrix2;
    cout << matrix4;
    Matrix matrix5 = matrix1 - matrix2;
    cout << matrix5;
    Matrix matrix6 = matrix1 * matrix3;
    cout << matrix6;
    return 0;
}