package ru.karachenkoilya.tasks.task05.task05_02;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        var listOfEmployees = getEmployees();

        var oldEmployees = Employee.findOldEmployee(listOfEmployees);
        oldEmployees.forEach(e -> System.out.println(e.getAge()));

        int itEmployees = Employee.countITEmployee(listOfEmployees);
        System.out.println("Working in IT: " + itEmployees);

        var richEmployee = Employee.getRichEmployee(listOfEmployees);
        System.out.println(richEmployee.getName() + " - " + richEmployee.getSalary());

        var hrNames = Employee.getHRNames(listOfEmployees);
        hrNames.forEach(System.out::println);

        var averageSalary = Employee.getAverageSalary(listOfEmployees);
        System.out.println(averageSalary);

    }

    public static List<Employee> getEmployees() {
        var listOfEmployees = new ArrayList<Employee>();
        listOfEmployees.add(new Employee("Ilya", 29, "IT", 150000));
        listOfEmployees.add(new Employee("Petr", 49, "Maitainance", 68000));
        listOfEmployees.add(new Employee("Kseniya", 32, "Sales", 96000));
        listOfEmployees.add(new Employee("Dmitry", 25, "IT", 177000));
        listOfEmployees.add(new Employee("Svetlana", 42, "HR", 79000));
        listOfEmployees.add(new Employee("Maria", 22, "HR", 57000));
        listOfEmployees.add(new Employee("Marat", 44, "IT", 357000));
        listOfEmployees.add(new Employee("Victor", 38, "Sales", 215000));

        return listOfEmployees;
    }


}
