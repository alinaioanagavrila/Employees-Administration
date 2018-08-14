package com.example.alinagavrila.employees_administration;

public class QaEmployee extends Employee {
    public boolean hasIstqb;
    public boolean isManual;
    public enum Platform {Mobile, Web, Desktop};
    Platform platform;

    public QaEmployee (String[] name, String[] CNP, int age,Gender gender, boolean hasIstqb, Platform platform, boolean isManual){
        super(name, CNP, age, gender);
        this.hasIstqb = hasIstqb;
        this.platform = platform;
        this.isManual = isManual;
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
