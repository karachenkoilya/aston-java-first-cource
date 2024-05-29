package ru.karachenkoilya.tasks.task05.task05_01;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        Collections.addAll(list,
                1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10, 1, 1, 11, 112, 13, 4, 123, 21, 11);
        int sum = list.stream().distinct().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
