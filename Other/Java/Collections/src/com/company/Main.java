package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList — реализация изменяемого массива интерфейса List
        List<String> listA = new ArrayList<String>(3);
        listA.add(0, "Hello");
        listA.add(1, "world");
        listA.add(2, "!");
        listA.add("Added to the end!");
        System.out.println(listA);

        List<String> listB = new ArrayList<String>(listA);//совпадает с listA
        listB.clear();// очистка
        listB.add("new list!");
        System.out.println(listB);
        System.out.println(listB.contains("Hello")); // проверка
        System.out.println(listB.contains("new list!"));
        listB.remove("new list!");
        System.out.println(listB.contains("new list!"));

        List<String> listC = new ArrayList<>();
        listC.add(0, "This is");
        listC.add(1, "my");
        listC.add(2, "new");
        listC.add("list");
        System.out.println(listC.get(1));// получить элемент

        List<String> listD = new ArrayList<>();
        listD.add(0, "Absolutely");
        listD.add(1, "class");
        listD.add(2, "boring");
        System.out.println(listD);
        Collections.sort(listD);// сортировка
        System.out.println(listD);

        String[] array = new String[listD.size()];
        listD.toArray(array);// превращаем listD в массив array (указываем в параметрах)
        for(int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }

        // Способы итерации
        //
        // Первый способ: Обычный цикл
        for (int i = 0; i < listD.size(); i++) {
            System.out.println(listD.get(i));
        }
        // Второй способ: Цикл Foreach
        for (String item : listD) {
            System.out.println(item);
        }
        // Третий способ: Лямбда выражение
        // указываем item как один из элементов списка
        // и для каждого делаем оператор слева
        listD.forEach(item -> System.out.println(item));
        // или
        // вызываем метод из класса Main куда передаем каждый из элементов по очереди
        listD.forEach(Main::printItemList);
    }
    private static void printItemList(String item) {
        System.out.println(item);
    }
}
