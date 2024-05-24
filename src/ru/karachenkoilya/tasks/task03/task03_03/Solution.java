package ru.karachenkoilya.tasks.task03.task03_03;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

import static ru.karachenkoilya.tasks.task03.task03_01.StringReader.readStrings;

public class Solution {
    public static void main(String[] args) {
        var list = readStrings(1);

        list.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .filter(s -> {
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(0) != s.charAt(i)) return true;
                    }
                    return false;
                })
                .findFirst().ifPresent(System.out::println);
    }
}
