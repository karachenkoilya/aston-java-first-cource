package ru.karachenkoilya.tasks.task03.task03_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringReader {

    /**
     * Считывает с консоли заданное количество строк
     * @param numberOfStrings количество строк
     * @return {@code List<String>}
     */
    public static List<String> readStrings(int numberOfStrings) {
        System.out.printf("Введите следующее количество строк: %d\n", numberOfStrings);
        Scanner sc = new Scanner(System.in);
        var list = new ArrayList<String>();
        for (int i = 0; i < numberOfStrings; i++) {
            list.add(sc.nextLine());
        }
        return list;
    }
}
