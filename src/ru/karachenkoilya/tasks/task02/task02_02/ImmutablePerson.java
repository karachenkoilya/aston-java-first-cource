package ru.karachenkoilya.tasks.task02.task02_02;

import java.util.ArrayList;

public final class ImmutablePerson {
    public final String name;
    public final Integer age;
    public final ArrayList<String> Hobbies;

    public ImmutablePerson(String name, Integer age, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        Hobbies = hobbies;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public ArrayList<String> getHobbies() {
        return Hobbies;
    }

    //Сеттеры. Возвращают новый объект.
    public ImmutablePerson setName(String name) {
        return new ImmutablePerson(name, this.age, this.Hobbies);
    }

    public ImmutablePerson setAge(Integer age) {
        return new ImmutablePerson(this.name, age, this.Hobbies);
    }

    public ImmutablePerson setHobbies(ArrayList<String> hobbies) {
        return new ImmutablePerson(this.name, this.age, hobbies);
    }

}
