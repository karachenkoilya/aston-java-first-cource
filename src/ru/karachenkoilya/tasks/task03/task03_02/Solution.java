package ru.karachenkoilya.tasks.task03.task03_02;

import static ru.karachenkoilya.tasks.task03.task03_01.StringReader.getStrings;

public class Solution {
    public static void main(String[] args) {
        var list = getStrings(3);

        int sumStringLength = 0;
        for (String s : list) {
            sumStringLength += s.length();
        }
        double averageStringLength = (double) sumStringLength / list.size();

        list.stream().filter(s -> s.length() < averageStringLength)
                .forEach(s -> System.out.printf("\"%s\" - length: %d\n", s, s.length()));
    }
}
