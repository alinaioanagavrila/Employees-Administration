package com.example.alinagavrila.employees_administration;

public abstract class Employee {
    String[] name;
    String[] CNP;
    int age;
    enum Gender { F, M };
    Gender gender;

    public Employee (String[] name, String[] CNP, int age, Gender gender){
        this.name = name;
        this.CNP = CNP;
        this.age = age;
        this.gender = gender;
    }

    public abstract void addNewEmployee();
    public abstract void viewEmployees();
    public abstract void sortEmployees();
    public abstract void updateEmployee();
}
