package com.example.alinagavrila.employees_administration;

public class QaEmployee extends Employee {
    private boolean hasIstqb;
    private boolean isManual;
    public enum Platform {Mobile, Web, Desktop};
    private Platform platform;

    public QaEmployee (String[] name, String[] CNP, int age,Gender gender, boolean hasIstqb, Platform platform, boolean isManual){
        super(name, CNP, age, gender);
        this.hasIstqb = hasIstqb;
        this.platform = platform;
        this.isManual = isManual;
    }

    public void setHasIstqb(boolean hasIstqb) {
        this.hasIstqb = hasIstqb;
    }

    public boolean isHasIstqb() {
        return hasIstqb;
    }

    public void setIsManual(boolean isManual){
        this.isManual = isManual;
    }

    public boolean getIsManual() {
        return isManual;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Platform getPlatform() {
        return platform;
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
