package com.example.alinagavrila.employees_administration;

public class PmEmployee extends Employee {
    private int numberOfEmplyees;

    private PmEmployee(String[] name, String[] CNP, int age,Gender gender, int numberOfEmplyees) {
        super(name, CNP, age, gender);
        this.numberOfEmplyees = numberOfEmplyees;
    }
    public void setNumberOfEmplyees(int numberOfEmplyees){
        this.numberOfEmplyees = numberOfEmplyees;
    }
    public int getNumberOfEmplyees(){
        return numberOfEmplyees;
    }
}
