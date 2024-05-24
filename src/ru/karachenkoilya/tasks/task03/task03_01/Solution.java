package ru.karachenkoilya.tasks.task03.task03_01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите 3 строки");
        Scanner sc = new Scanner(System.in);
        var list = new ArrayList<String>();
        list.add(sc.nextLine());
        list.add(sc.nextLine());
        list.add(sc.nextLine());

        System.out.printf("The longest string is \"%s\"\n",
                list.stream().max(Comparator.comparingInt(String::length)).get());
        System.out.printf("The shortest string is \"%s\"\n",
                list.stream().min(Comparator.comparingInt(String::length)).get());

        list.forEach(s -> System.out.printf("String \"%s\" has length %d\n", s, s.length()));
    }
}
