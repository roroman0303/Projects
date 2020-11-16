package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int name[] = new int[10]; // массив из 10 элементов
        for (int i = 0; i < 10; i++) {
            name[i] = i*i;
            System.out.println(name[i]);
        }
        // Размер массива введем с клавиатуры
        System.out.println("Введите размер массива: ");
        Scanner num = new Scanner(System.in);
        int size = 1; // по умолчанию размер 1
        if (num.hasNextInt()) size = num.nextInt(); // присваиваем размер с клавиатуры
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i*i*i;
            System.out.println(arr[i]);
        }

        // Сделаем двумерный массив того же размера
        // Для объявления необязательно делать цикл
        float td_arr[][] = new float[size][size];
        for (int i = 0; i < size; i++){
            for (int k = 0; k < size; k++){
                td_arr[i][k] = i*k;
                System.out.println(td_arr[i][k]);
            }
        }

    }
}
