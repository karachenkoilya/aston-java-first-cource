package ru.karachenkoilya.tasks.task03.task03_04;
import static ru.karachenkoilya.tasks.task03.task03_01.StringReader.readStrings;

public class Solution {
    public static void main(String[] args) {
        var word = readStrings(1).getFirst();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            output.append(word.charAt(i)).append(word.charAt(i));
        }
        System.out.println(output);
    }
}
