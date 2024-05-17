package ru.karachenkoilya.tasks.task02.task02_02;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {

        var hobbies1 = new ArrayList<String>();
        Collections.addAll(hobbies1, "hiking", "welding", "cycling");
        var hobbies2 = new ArrayList<String>();
        Collections.addAll(hobbies2, "running", "collecting", "car restoration");

        ImmutablePerson immutablePerson1 = new ImmutablePerson("Petr", 22, hobbies1);
        var immutablePerson2 = immutablePerson1;
        System.out.println(immutablePerson1);
        System.out.println(immutablePerson2); // увидели, что 2 переменные ссылаются на 1 объект
        immutablePerson1 = immutablePerson1.setAge(25);
        System.out.println("-----\n" + immutablePerson1);
        System.out.println(immutablePerson2); // теперь переменные ссылаются на разные объекты

        System.out.println();

        MutablePerson mutablePerson1 = new MutablePerson("Pqvel", 22, hobbies1);
        var mutablePerson2 = mutablePerson1;
        System.out.println(mutablePerson1);
        System.out.println(mutablePerson2); //2 переменные ссылаются на 1 объект
        mutablePerson1.setHobbies(hobbies2);
        System.out.println("-----\n" + mutablePerson1);
        System.out.println(mutablePerson2); //переменные по-прежнему ссылаются на 1 объект.

    }
}
