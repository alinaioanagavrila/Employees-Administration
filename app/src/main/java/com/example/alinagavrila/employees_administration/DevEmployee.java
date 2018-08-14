package com.example.alinagavrila.employees_administration;

public class DevEmployee extends Employee {
    public enum ProgrammingLanguage {Java, CSharp, CPlusPlus, C, Python, Javascript, DotNet, Ruby};
    private ProgrammingLanguage programmingLanguage;

    public  DevEmployee(String[] name, String[] CNP, int age,Gender gender, ProgrammingLanguage programmingLanguage) {
        super(name, CNP, age, gender);
        this.programmingLanguage = programmingLanguage;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
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
