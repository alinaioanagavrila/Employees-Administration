package com.example.alinagavrila.employees_administration;

public class DevEmployee extends Employee {
    public enum ProgrammingLanguage {Java, CSharp, CPlusPlus, C, Python, Javascript, DotNet, Ruby};
    ProgrammingLanguage programmingLanguage;

    public DevEmployee(String[] name, String[] CNP, int age,Gender gender, ProgrammingLanguage programmingLanguage) {
        super(name, CNP, age, gender);
        this.programmingLanguage = programmingLanguage;
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
