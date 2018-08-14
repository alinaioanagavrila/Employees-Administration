package com.example.alinagavrila.employees_administration;

public abstract class Employee {
    String[] name;
    String[] CNP;
    int age;

    public Employee (String[] name, String[] CNP, int age){
        this.name = name;
        this.CNP = CNP;
        this.age = age;
    }

    public abstract void addNewEmployee();
    public abstract void viewEmployees();
    public abstract void sortEmployees();
    public abstract void updateEmployee();
}
