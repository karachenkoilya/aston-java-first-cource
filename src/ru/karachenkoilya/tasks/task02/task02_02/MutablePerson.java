package ru.karachenkoilya.tasks.task02.task02_02;

import java.util.ArrayList;
import java.util.List;

public class MutablePerson {
    public String name;
    public Integer age;
    public ArrayList<String> Hobbies;

    public MutablePerson(String name, Integer age, ArrayList<String> hobbies) {
        this.name = name;
        this.age = age;
        Hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return Hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        Hobbies = hobbies;
    }
}
