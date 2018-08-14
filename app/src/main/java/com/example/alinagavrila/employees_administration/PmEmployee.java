package com.example.alinagavrila.employees_administration;

public class PmEmployee extends Employee {
    public int numberOfEmplyees;

    public PmEmployee(String[] name, String[] CNP, int age,Gender gender, int numberOfEmplyees) {
        super(name, CNP, age, gender);
        this.numberOfEmplyees = numberOfEmplyees;
    }

    @Override
    public void addNewEmployee() {

    }

    @Override
    public void viewEmployees() {

    }

    @Override
    public void sortEmployees() {

    }

    @Override
    public void updateEmployee() {

    }
}
