package ru.karachenkoilya.tasks.task05.task05_02;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int age;
    private String department;
    private int salary;

    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static List<Employee> findOldEmployee(List<Employee> employees) {
        return employees.stream().filter(e -> e.getAge() > 30).sorted(Comparator.comparingInt(Employee::getAge)).toList();
    }

    public static int countITEmployee(List<Employee> employees) {
        return (int) employees.stream().filter(e -> e.getDepartment().equals("IT")).count();
    }

    public static Employee getRichEmployee(List<Employee> employees) {
        return employees.stream().max(Comparator.comparingInt(Employee::getSalary)).orElseThrow(NoSuchElementException::new);
    }

    public static List<String> getHRNames(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals("HR"))
                .map(Employee::getName)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public static double getAverageSalary(List<Employee> employees) {
        return employees.stream().map(Employee::getSalary)
                .mapToInt(Integer::intValue).sum() * 1.0 / employees.size();
    }
}
