package com.company;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner; // для ввода в консоль

public class Main {

    public static void main(String[] args) {
        // =================================
        // Первый урок
	    System.out.println("hello"); // вывод в консоль
        System.out.print("hello n2"); // вывод без переноса строки
        // sout для быстрого набора

        int num00 = 146546;
        double num002 = 2343.23;
        boolean tmp00 = true;
        char sym00 = 't';
        String mystr00 = "lalala";

        System.out.println("\n"+mystr00+"\n====================");
        // =================================
        // Второй урок

        int num89 = 89;
        System.out.println("Преобразованное число: "+ num89); // преобразуется в String самостоятельно

        while(true) { // ввод строки
            System.out.print("Введите строку: ");
            Scanner input_str = new Scanner(System.in);
            if (input_str.hasNextLine()) { // проверка на строку
                String str = input_str.nextLine();
                System.out.println("Ваша строка: " + str);
                break;
            } else {
                System.out.println("Это не строка!");
            }
        }

        while(true) { // ввод числа
            System.out.print("Введите число: ");
            Scanner input_int = new Scanner(System.in);
            if (input_int.hasNextInt()) { // проверка на число
                int num = input_int.nextInt();
                System.out.println("Ваше число: " + num);
                break;
            } else {
                System.out.println("Это не число!");
            }
        }

        Scanner input_text = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        while(input_text.hasNext()) { // Печатаем до тех пор, пока есть что-то
            System.out.println(input_text.nextLine());
        }
    }
}
