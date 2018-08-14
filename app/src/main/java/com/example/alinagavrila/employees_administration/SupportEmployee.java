package com.example.alinagavrila.employees_administration;

public class SupportEmployee extends Employee {
    public boolean installOperatingSystem;
    public boolean networkSupport;
    public boolean hardwareSupport;

    public SupportEmployee(String[] name, String[] CNP, int age,Gender gender, boolean installOperatingSystem, boolean networkSupport, boolean hardwareSupport) {
        super(name, CNP, age, gender);
        this.installOperatingSystem = installOperatingSystem;
        this.networkSupport = networkSupport;
        this.hardwareSupport = hardwareSupport;
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
