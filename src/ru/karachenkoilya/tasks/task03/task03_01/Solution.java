package ru.karachenkoilya.tasks.task03.task03_01;

import java.util.Comparator;
import static ru.karachenkoilya.tasks.task03.task03_01.StringReader.getStrings;

public class Solution {
    public static void main(String[] args) {
        var list = getStrings(3);

        System.out.printf("The longest string is \"%s\"\n",
                list.stream().max(Comparator.comparingInt(String::length)).get());
        System.out.printf("The shortest string is \"%s\"\n",
                list.stream().min(Comparator.comparingInt(String::length)).get());

        list.forEach(s -> System.out.printf("String \"%s\" has length %d\n", s, s.length()));
    }


}
