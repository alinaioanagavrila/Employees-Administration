package com.example.alinagavrila.employees_administration;

public class AdministrativeEmployee extends Employee {
    public boolean approvesLeave;
    public boolean isCalculatingTheSalaries;

    public AdministrativeEmployee(String[] name, String[] CNP, int age,Gender gender, boolean approvesLeave, boolean isCalculatingTheSalaries) {
        super(name, CNP, age, gender);
        this.approvesLeave = approvesLeave;
        this.isCalculatingTheSalaries = isCalculatingTheSalaries;
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
